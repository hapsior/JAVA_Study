package com.company;

public class Application {
    String name;
    Double version;
    Double price;

    public Application(String name,Double version,Double price){
        this.name=name;
        this.version=version;
        this.price=price;
    }
    public String GetName(){
        return name;
    }
    public Double GetPrice(){
        return price;
    }
}
