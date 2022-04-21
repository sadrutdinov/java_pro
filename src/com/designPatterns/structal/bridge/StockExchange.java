package com.designPatterns.structal.bridge;

public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("StockExchange development in progress");
        developer.writeCode();
    }
}
