package com.company;

import java.util.List;

public class Electric extends Car {
    public Electric(String model, String producer, String color, int year, double value) {
        super(model, producer, color, year, value);
        this.model=model;
        this.producer=producer;
        this.color=color;
        this.year=year;
        this.value=value;
    }

    @Override
    public void refuel() {
        this.fuel=100;
        System.out.println("fuel: "+fuel);
    }

}
