package com.bigdeal.thread.demo1;

import java.util.Queue;
import java.util.concurrent.*;

public class Scheduler<T> {
    private Consumer<T> consumer;
    private final Queue<T> queue = new PriorityBlockingQueue<>();
    private final  Runnable consumeTask = new Runnable() {
        @Override
        public void run() {
            T data = queue.poll();
            while (data != null) {
                consumer.consume(data);
                data = queue.poll();
            }
        }
    };

    public void startConsume(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void produce(Producer<T> producer) {
        T produce = producer.produce();
        queue.add(produce);
    }

    public void shutdown() {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(consumeTask);
        exec.shutdown();
        try {
            exec.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
        }
    }
}
