import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bigdeal.Consumer;
import com.bigdeal.Producer;
import com.bigdeal.Scheduler;
import org.junit.jupiter.api.Test;

// Please DON'T modify this class
class SchedulerTest {
    @Test
    void test() throws InterruptedException {
        final List<Integer> results = new ArrayList<Integer>();
        final Set<Long> producerIDs = new HashSet<Long>();
        final Set<Long> consumerIDs = new HashSet<Long>();
        long currentThread = Thread.currentThread().getId();
        final List<Thread> consumerThreads = new ArrayList<Thread>();


        Scheduler<Integer> scheduler = new Scheduler<Integer>();

        scheduler.startConsume(new Consumer<Integer>() {
            public void consume(Integer data) {
                long id = Thread.currentThread().getId();
                synchronized (this) {
                    if (consumerThreads.isEmpty()) {
                        consumerThreads.add(Thread.currentThread());
                    }
                    consumerIDs.add(id);
                    results.add(data);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("consumer " + id + ", data=" + data);
            }

        });
        // don't assume there are only 4 items in Scheduler implementation
        for (int i = 1; i <= 4; i++) {
            int data = i;
            scheduler.produce(new Producer<Integer>() {
                protected Integer produce() {
                    long id = Thread.currentThread().getId();
                    synchronized (this) {
                        producerIDs.add(id);
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("producer " + id + " data=" + data);
                    return data;
                }
            });
        }


        scheduler.shutdown();

        assertEquals(4, results.size());
        assertEquals(1, results.get(0).intValue());
        assertEquals(2, results.get(1).intValue());
        assertEquals(3, results.get(2).intValue());
        assertEquals(4, results.get(3).intValue());

        assertEquals(1, consumerIDs.size());
        assertNotEquals(currentThread, consumerIDs.iterator().next());

        assertEquals(1, producerIDs.size());
        assertEquals(currentThread, producerIDs.iterator().next().longValue());

        assertEquals(1, consumerThreads.size());
        assertFalse(consumerThreads.get(0).isAlive());
    }

    public static void main(String[] args) {
        try {
            SchedulerTest schedulerTest = new SchedulerTest();
            schedulerTest.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}