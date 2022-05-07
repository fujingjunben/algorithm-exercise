package com.bigdeal.pattern;

public class SingletonInnerClassDemo {
    private SingletonInnerClassDemo(){}

    public static SingletonInnerClassDemo getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private final static SingletonInnerClassDemo INSTANCE = new SingletonInnerClassDemo();
    }
}
