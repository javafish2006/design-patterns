package com.openmind.pattern.structural.decorator.coffees;

import com.openmind.pattern.structural.decorator.Coffee;

public class DarkCoffee implements Coffee {

    @Override
    public String getSeasoning() {
        return "深焙咖啡";
    }

    @Override
    public double price() {
        return 2.99;
    }
}
