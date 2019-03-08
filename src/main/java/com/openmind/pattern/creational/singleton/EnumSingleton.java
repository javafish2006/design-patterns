package com.openmind.pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class EnumSingleton {

    //由枚举的机制确保， 只有单个枚举的元素
    //避免反序列化产生多个实例， 或者反射创建多个单例的问题
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        //instance operate way
        System.out.println(singleton.getValue());
        singleton.setValue(10);
        System.out.println(singleton.getValue());


        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {

            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SingletonEnum.INSTANCE.getValue());
                }
            });
        }
        threadPool.shutdown();
    }
}
