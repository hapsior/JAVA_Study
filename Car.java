package com.company;

public abstract class Car extends Device  {
    String color;

    int fuel;
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
                if(this.model.equals(cars[i].model)&&buyer.cash>price&&buyer.CheckAvailablePlace()){
                    buyer.SetCar(cars[i]);
                    seller.setCarToNull(cars[i]);
                    buyer.cash -= price;
                    seller.cash += price;
                    System.out.println(buyer.firstName + " bought car from " + seller.firstName);
                }
                else{
                    System.out.println(buyer.firstName+" doesnt have enough money or car doesnt exist or there is no place in the garage");
                }





        }



    }
    public abstract void refuel();


}
