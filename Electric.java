package com.company;

public class Electric extends Car {
    public Electric(String model, String producer, String color, int year, double value) {
        super(model, producer, color, year, value);
    }

    @Override
    public void refuel() {
        this.fuel=100;
        System.out.println("fuel: "+fuel);
    }

}
