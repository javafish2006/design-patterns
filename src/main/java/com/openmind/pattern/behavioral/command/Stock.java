package com.openmind.pattern.behavioral.command;

/**
 * 请求类
 */
public class Stock {

    private String name;
    private int quantity;

    public void buy() {
        System.out.printf("%s %s bought \n", name, quantity);
    }

    public void sell() {
        System.out.printf("%s %s sold \n", name, quantity);
    }

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
