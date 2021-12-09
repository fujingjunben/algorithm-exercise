package com.bigdeal.thread;

import com.bigdeal.thread.javawaitnotify.Data;
import com.bigdeal.thread.javawaitnotify.Receiver;
import com.bigdeal.thread.javawaitnotify.Sender;
import org.junit.jupiter.api.Test;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }
}
