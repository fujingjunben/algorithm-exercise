package com.bigdeal.thread;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadDemo1 {
    @Test
    public void threadPool(){
        ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        executor.execute(() -> {

            System.out.println("test1");
        });

        System.out.println(executor.getPoolSize());

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.execute(() -> {
            System.out.println("test2");
        });

        executor.execute(() -> {
            System.out.println("test3");
        });

        Assertions.assertEquals(2, executor.getPoolSize());
    }
}
