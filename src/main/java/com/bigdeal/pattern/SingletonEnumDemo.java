package com.bigdeal.pattern;

public enum SingletonEnumDemo {
    INSTANCE;

    public int sum(int i, int j) {
        return i + j;
    }
}
