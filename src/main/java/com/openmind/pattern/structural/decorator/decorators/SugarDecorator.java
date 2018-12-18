package com.openmind.pattern.structural.decorator.decorators;

import com.openmind.pattern.structural.decorator.AbstractCoffeeDecorator;
import com.openmind.pattern.structural.decorator.Coffee;

public class SugarDecorator extends AbstractCoffeeDecorator {

    public SugarDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public String getSeasoning() {
        return decoratorCoffee.getSeasoning() + ", +糖";
    }

    @Override
    public double price() {
        return decoratorCoffee.price() + 0.5;
    }
}
