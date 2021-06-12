package com.company;

public class Phone extends Device {
    String producer;
    String model;
    int screenSize;
    String os;

    public String toString(){
        return this.producer+" "+this.model+" "+this.os+" "+this.screenSize;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone!=null&&buyer.cash>price){
            buyer.phone=seller.phone;
            seller.phone=null;
            buyer.cash-=price;
            seller.cash+=price;
            System.out.println( buyer.firstName+" bought phone from "+seller.firstName);
        }
    }
}
