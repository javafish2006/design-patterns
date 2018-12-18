package com.openmind.pattern.structural.decorator;

public interface Coffee {
    /**
     * 调料：如牛奶、糖
     * @return
     */
    String getSeasoning();

    /**
     * 价格
     * @return
     */
    double price();
}
