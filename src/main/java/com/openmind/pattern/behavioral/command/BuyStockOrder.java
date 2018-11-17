package com.openmind.pattern.behavioral.command;

public class BuyStockOrder implements Order {

    private Stock stock;

    public BuyStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
