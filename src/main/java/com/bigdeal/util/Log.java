package com.bigdeal.util;

public class Log {
    public static void error(String msg, Exception e) {
        System.out.println(msg + e.getMessage());
    }
}
