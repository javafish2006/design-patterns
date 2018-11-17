package com.openmind.pattern.creational.singleton;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class LazyInitSingleton {

    private static volatile LazyInitSingleton INSTANCE;

    private LazyInitSingleton() {
    }

    public static LazyInitSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyInitSingleton.class) {
                if (INSTANCE == null) {
                    //test start 测试时延长等待时间，对比线程安全效果
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //test end
                    INSTANCE = new LazyInitSingleton();
                }
            }
        }

        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {

        Set<Object> set = ConcurrentHashMap.newKeySet();

        int size = 1000;
        CountDownLatch countDownLatch = new CountDownLatch(size);

        for (int i = 0; i < size; i++) {
            final int idx = i;
            new Thread(() -> {
                LazyInitSingleton tmp = LazyInitSingleton.getInstance();
                set.add(tmp);
                System.out.println("Thread-" + idx + tmp);
                countDownLatch.countDown();
            }).start();
        }


        countDownLatch.await();
        System.out.printf("size of set: %s \n", set.size());

//        LazyInitSingleton t1 = LazyInitSingleton.getInstance();
//        LazyInitSingleton t2 = LazyInitSingleton.getInstance();
//
//        //vm -ea
//        assert t1 == t2 : "t1 not equal t2";
//
//        LazyInitSingleton t3 = new LazyInitSingleton();
//        assert t1 == t3 : "t1 not equal t3";

    }
}
