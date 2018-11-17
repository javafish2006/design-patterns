package com.openmind.pattern.behavioral.command;

public class CommandDemo {

    public static void main(String[] args) {
        Stock stock = new Stock("003003", 100);
        BuyStockOrder buyStockOrder = new BuyStockOrder(stock);
        SellStockOrder sellStockOrder = new SellStockOrder(stock);

        Broker broker = new Broker();
        broker.addOrder(buyStockOrder);
        broker.addOrder(sellStockOrder);

        broker.placeOrders();
        System.out.println();

        Stock stock1 = new Stock("600001", 1024);
        BuyStockOrder buyStockOrder1 = new BuyStockOrder(stock1);
        broker.addOrder(buyStockOrder1);

        broker.placeOrders();

    }
}
