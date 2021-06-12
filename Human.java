package com.company;

public class Human{
String firstName;
String lastName;
Phone phone;
Animal pet;
Double cash;
private Car car;
private Double salary;

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
public Car getCar(){
    return this.car;
}
public void setCar(Car car){ this.car=car;}
public void setCarToNull(){this.car=null;}
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

}
