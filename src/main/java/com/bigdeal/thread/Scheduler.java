package com.bigdeal.thread;

public class Scheduler<T> {
    private Producer<T> producer;
    private Consumer<T> consumer;
    private Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            T data = producer.produce();
                    consumer.consume(data);
            }
    });

    public void startConsume(Consumer<T> consumer) {
        this.consumer = consumer;
        thread.start();
    }

    public void produce(Producer<T> producer) {
        this.producer = producer;
        thread.notify();
    }

    public void shutdown() {
        thread.interrupt();
    }
}
