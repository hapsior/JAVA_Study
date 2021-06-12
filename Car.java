package com.company;

import com.company.devices.Device;

public class Car extends Device  {
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


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar()!=null&&buyer.cash>price) {
            buyer.setCar(seller.getCar());
            seller.setCarToNull();
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.firstName + " bought car from " + seller.firstName);
        }
        else{
            System.out.println(buyer.firstName+" doesnt have enough money or car doesnt exist");
            }

}
}
