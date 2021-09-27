package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Phone extends Device {
    int screenSize;
    String os;
    static final String serverAddress="172.245.129.32";
    static final String protocol="FTP";
    static final String defaultName="Unknown";

    public Phone(String producer, String model, int year, Double value) {
        super(producer, model, year, value);
        this.producer=producer;
        this.model=model;
        this.year=year;
        this.value=value;
    }

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
    public void installAnnApp(String name){
        System.out.println(name+" app was installed");
    }
    public void installAnnApp(String name,double version){
        System.out.println(name+" "+" was installed. Version: "+version);
    }
    public void installAnnApp(String name, double version,String serverAddress){
        System.out.println(name+" "+" was installed. Version: "+version+"\n server address: "+serverAddress);
    }
    public void installAnnApp(String... app){
        List<String[]> apps=new ArrayList<>();
        apps.add(app);
        apps.forEach(System.out::println);
    }

}
