package com.openmind.pattern.structural.decorator.coffees;

import com.openmind.pattern.structural.decorator.Coffee;

public class StrongCoffee implements Coffee {

    @Override
    public String getSeasoning() {
        return "浓缩咖啡";
    }

    @Override
    public double price() {
        return 1.99;
    }
}
