package com.company;
import com.company.creatures.Animal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Human{
public String firstName;
String lastName;
public Phone phone;
public Animal pet;
public Double cash;
private Double salary;
private int garageSlots;
private Car[] garage;
    private Car car;

    public Human(String firstName,String lastName,Phone phone,Animal pet,Double cash,Double salary){
    this.firstName=firstName;
    this.lastName=lastName;
    this.phone=phone;
    this.pet=pet;
    this.cash=cash;
    this.salary=salary;
    this.garage=new Car[3];
}
    public Human(String firstName,String lastName,Phone phone,Animal pet,Double cash,Double salary,int garageSlots){
        this.firstName=firstName;
        this.lastName=lastName;
        this.phone=phone;
        this.pet=pet;
        this.cash=cash;
        this.salary=salary;
        this.garageSlots=garageSlots;
        this.garage=new Car[garageSlots];
    }

public Double getSalary()
{
    System.out.println(salary);
        return salary;
}
public void setSalary(Double salary)
{
    if(salary<0){
        System.out.println("New salary cannot be less than 0!");
    }
    else{
        System.out.println("New salary has been approved by system");
        System.out.println("Please sign the paper about rise");
        System.out.println("ZUS already know about your salary, do not try to hide it!");
        this.salary=salary;
        this.cash=salary;
    }

}
public Car GetCar(int garagePlace) {
    if (garagePlace > garageSlots) {
        return null;
    } else {
        return garage[garagePlace - 1];
    }
}
public Car[] GetCars(){
        return garage;
}

public void GetCar(Car car,int garagePlace){
        garage[garagePlace-1]=car;
    }
public void setCarToNull(Car car)
{
    for (int i = 0; i < garage.length; i++) {
        if(car==garage[i]){
            garage[i]=null;
        }
    }
}
public void canIBuyThisCar(Car car){
    if(salary>car.value){
        System.out.println("Congrats, car is yours!");
        this.car=car;
    }
    else if(salary>(car.value/(1/12))){
        System.out.println("Car has been bought on credit!");
        this.car=car;
    }
    else{
        System.out.println("LOL go get some job!");
    }
}
    public String toString(){
    return this.firstName+" "+this.lastName+" "+this.phone+" "+this.car+" "+this.pet+" "+this.salary;
    }

    public Double CountValueOfYourCars(){
        Double value=0.0;
        for (int i = 0; i < garage.length; i++) {
            if(garage[i]==null){

            }
            else{
            value+=garage[i].value;
        }
        }
        return value;
    }
    public Car[] SortCarsFromOldest(){
        Comparator<Car> byYear=Comparator.comparing(Car::GetValue);
        Arrays.sort(garage,byYear);
        return garage;
    }
    public boolean CheckAvailablePlace() throws Exception {
        for (int i = 0; i < garage.length; i++) {
            if(garage[i]==null){
                return true;
            }
        }
        throw new Exception();
    }
    public void SetCar(Car car) throws Exception {
        for (int i = 0; i < garage.length; i++) {
            if(garage[i]==null){
                garage[i]=car;
            }
        }
    }
    public void SetCar(Car car,int place)
    {
        garage[place-1]=car;
    }
}
