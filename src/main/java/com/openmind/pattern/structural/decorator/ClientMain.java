package com.openmind.pattern.structural.decorator;

import com.openmind.pattern.structural.decorator.coffees.DarkCoffee;
import com.openmind.pattern.structural.decorator.coffees.StrongCoffee;
import com.openmind.pattern.structural.decorator.decorators.MilkDecorator;
import com.openmind.pattern.structural.decorator.decorators.SugarDecorator;

public class ClientMain {

    public static void main(String[] args) {
        //动态添加两种功能; 继续添加装饰器类型时， 满足开闭原则； 删除时也满足开闭原则
        Coffee coffee = new StrongCoffee();
        coffee = new MilkDecorator(coffee);
        System.out.printf("seasoning:%s, price: %s \n", coffee.getSeasoning(), coffee.price());
        coffee = new SugarDecorator(coffee);
        System.out.printf("seasoning:%s, price: %s \n", coffee.getSeasoning(), coffee.price());

        //动态添加一种功能， 动态撤销
        Coffee coffee1 = new DarkCoffee();
        coffee1 = new SugarDecorator(coffee1);
        System.out.printf("seasoning:%s, price: %s \n", coffee1.getSeasoning(), coffee1.price());
    }
}
