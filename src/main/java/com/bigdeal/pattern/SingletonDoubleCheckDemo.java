package com.bigdeal.pattern;

public class SingletonDoubleCheckDemo {

    private static volatile SingletonDoubleCheckDemo singletonDemo = null;

    private SingletonDoubleCheckDemo(){}

    public static SingletonDoubleCheckDemo getInstance(){
        if (singletonDemo == null) {
            synchronized(SingletonDoubleCheckDemo.class) {
                if (singletonDemo == null) {
                    singletonDemo = new SingletonDoubleCheckDemo();
                }
            }
        }
        return singletonDemo;
    }

}
