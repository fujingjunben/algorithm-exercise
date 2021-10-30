package com.bigdeal.thread;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Scheduler<T> {
    private Consumer<T> consumer;
    private final Queue<T> queue = new ArrayBlockingQueue<>(1);
    private final Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try{
                    T data = queue.poll();
                    if (data == null) {
                        continue;
                    }
                    consumer.consume(data);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    });

    public void startConsume(Consumer<T> consumer) {
        this.consumer = consumer;
        thread.start();
    }

    public void produce(Producer<T> producer) {
        T produce = producer.produce();
        queue.add(produce);
    }

    public void shutdown() {
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
