package com.company;

import com.company.devices.Device;

public class Car extends Device {
    String model;
    String producer;
    String color;
    int year;
    int value;
    public Car(String model, String producer,String color,int year,int value){
        this.model=model;
        this.producer=producer;
        this.color=color;
        this.year=year;
        this.value=value;
    }

    public boolean equals(Object obj)
    {
        return (this==obj);
    }
    public int hashCode(){
        return value;
    }

    public String toString(){
        return this.producer+" "+this.model+" "+this.value+" "+this.color+" "+this.year;
    }
}
