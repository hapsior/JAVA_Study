package com.company;

import java.util.*;

public class Phone extends Device {
    int screenSize;
    String os;
    static final String serverAddress="172.245.129.32";
    static final String protocol="FTP";
    static final String defaultName="Unknown";
    ArrayList<Application> apps=new ArrayList<Application>();
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

    public void InstallAnnApp(Human owner,Application app){
        if(owner.cash>app.price){
            owner.cash-=app.price;
            apps.add(app);
            System.out.println("Succesfully installed");
        }

    }
    public void CheckInstalledApp(Application app){
        for (int i = 0; i < apps.size(); i++) {
            if(app==apps.get(i)){
                System.out.println(app.name+" App is installed");
            }
            else{
                System.out.println(app.name+" App is not installed");
            }
        }
    }
    public void CheckInstalledApp(String name){
        for (int i = 0; i < apps.size(); i++) {
            if(name==apps.get(i).name){
                System.out.println(apps.get(i).name+" App is installed");
            }
            else{
                System.out.println(apps.get(i).name+" App is not installed");
            }
        }
    }
    public void DisplayAllFreeApps(){
        for (int i = 0; i < apps.size(); i++) {
            if(apps.get(i).price==0.0){
                System.out.println(apps.get(i).name+" is for free");
            }
        }
    }
    public Double CountValueOfApps(){
        Double value=0.0;
        for (int i = 0; i < apps.size(); i++) {
            value+=apps.get(i).price;
        }
        return value;
    }
    public void SortAppsByName(){
        Collections.sort(apps,Comparator.comparing(Application::GetName));
        for (int i = 0; i < apps.size(); i++) {
            System.out.println(apps.get(i).name);
        }
    }
    public void SortAppsFromCheapest(){
        Collections.sort(apps,Comparator.comparing(Application::GetPrice));
        for (int i = 0; i < apps.size(); i++) {
            System.out.println(apps.get(i).price+" "+apps.get(i).name);
        }
    }
}
