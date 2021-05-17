package com.company;

public class Phone {
    String producer;
    String model;
    int screenSize;
    String os;

    public String toString(){
        return this.producer+" "+this.model+" "+this.os+" "+this.screenSize;
    }
}
