package com.openmind.pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//内部类线程安全
public class NestClassSingleton {

    //1.不允许的通过公有构建函数实例化
    private NestClassSingleton(){

    }

    //2.私有内部类， 非外部类不可创建及访问
    private static class SingletonHolder{
        //静态变量， 外部类可访问
        private static NestClassSingleton INSTANCE = new NestClassSingleton();
    }

    public static NestClassSingleton getInstance(){
        //3.提供单实例， 在调用时才加载
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(NestClassSingleton.getInstance());
                }
            });
        }
        threadPool.shutdown();
    }
}
