package com.openmind.pattern.structural.decorator;

//实现被装饰类的接口， 定义装饰器的抽象类
public abstract class AbstractCoffeeDecorator implements Coffee {

    protected Coffee decoratorCoffee;

    public AbstractCoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }

    public abstract String getSeasoning();

    public abstract double price();
}
