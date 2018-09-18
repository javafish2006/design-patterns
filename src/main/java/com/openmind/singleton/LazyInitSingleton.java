package com.openmind.singleton;

public class LazyInitSingleton {

    private static volatile LazyInitSingleton INSTANCE;

    private LazyInitSingleton() {
    }

    public static LazyInitSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyInitSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyInitSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
