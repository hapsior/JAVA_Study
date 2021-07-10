package com.company;

public class Diesel extends Car{
    public Diesel(String model, String producer, String color, int year, int value) {
        super(model, producer, color, year, value);
    }

    @Override
    public void refuel() {
        this.fuel=100;
        System.out.println("fuel: "+fuel);
    }
}
