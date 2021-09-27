package com.company;

import java.util.List;

public abstract class Car extends Device  {
    String color;

    int fuel;
    List<Human> carOwners;
    public Car(String model,String producer,String color,int year,Double value){
        super(producer,model,year,value);
        this.model=model;
        this.producer=producer;
        this.value=value;
        this.color=color;
        this.year=year;
        this.fuel=0;
    }

    //public boolean equals(Object obj)
    //{
    //    return (this==obj);
    //}
    //public int hashCode(){
    //    return value;
    //}

    public String toString(){
        return this.producer+" "+this.model+" "+this.value+" "+this.color+" "+this.year;
    }



    public void sell(Human seller, Human buyer, Double price) throws Exception {

        Car cars[]=seller.GetCars();



            for (int i = 0; i < cars.length; i++) {
                if(this.model.equals(cars[i].model)&&buyer.cash>price&&buyer.CheckAvailablePlace()&&CheckLastOwner(seller)){
                    buyer.SetCar(cars[i]);
                    seller.setCarToNull(cars[i]);
                    buyer.cash -= price;
                    seller.cash += price;
                    carOwners.add(buyer);
                    System.out.println(buyer.firstName + " bought car from " + seller.firstName);
                }
                else{
                    System.out.println(buyer.firstName+" doesnt have enough money or car doesnt exist or there is no place in the garage");
                }
        }



    }
    public abstract void refuel();
    public boolean CheckLastOwner(Human owner){
        if(owner==carOwners.get(carOwners.size()-1)){
            return true;
        }
            return false;
    }
    public boolean WasOwnerAnytime(Human human){
        for (int i = 0; i < carOwners.size(); i++) {
            if(human==carOwners.get(i)){
                return true;
            }
        }
        return false;
    }
    public boolean IsHeSoldHim(Human seller,Human buyer){
        for (int i = 0; i < carOwners.size(); i++) {
            if(buyer==carOwners.get(i)&&seller==carOwners.get(i-1)){
                return true;
            }
        }
        return false;
    }
}
