package com.openmind.pattern.structural.decorator.decorators;

import com.openmind.pattern.structural.decorator.AbstractCoffeeDecorator;
import com.openmind.pattern.structural.decorator.Coffee;

public class MilkDecorator extends AbstractCoffeeDecorator {

    public MilkDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public String getSeasoning() {
        //增加当前装饰器的处理过程-前
        //调用被装饰类的执行过程（构造函数注入的对象， 面向接口）
        //增加当前装饰器的处理过程-后
        return decoratorCoffee.getSeasoning()+ ", + 牛奶";
    }

    @Override
    public double price() {
        return decoratorCoffee.price() + 0.3;
    }
}
