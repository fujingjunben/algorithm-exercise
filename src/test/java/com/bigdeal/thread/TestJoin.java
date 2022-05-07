package com.bigdeal.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestJoin {
    class SampleThread extends Thread {
        public int processingCount = 0;

        SampleThread(int processingCount) {
            this.processingCount = processingCount;
            System.out.println("Thread Created");
        }

        @Override
        public void run() {
            System.out.println("Thread " + this.getName() + " started");
            while (processingCount > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread " + this.getName() + " interrupted");
                }
                processingCount--;
            }
            System.out.println("Thread " + this.getName() + " exiting");
        }
    }


    @Test
    public void givenStartedThread_whenJoinCalled_waitsTillCompletion()
            throws InterruptedException {
        Thread t2 = new SampleThread(1);
        t2.start();
        System.out.println("Invoking join");
        t2.join();
        System.out.println("Returned from join");
        assertFalse(t2.isAlive());
    }
}
