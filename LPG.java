package com.company;

public class LPG extends Car{
    public LPG(String model, String producer, String color, int year, double value) {
        super(model, producer, color, year, value);
    }

    @Override
    public void refuel() {
        this.fuel=100;
        System.out.println("fuel: "+fuel);
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
