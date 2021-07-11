package com.company;

import com.company.creatures.Animal;



public class Human{
public String firstName;
String lastName;
Phone phone;
public Animal pet;
public Double cash;
private Double salary;
private Car[] garage;

public Human(String _firstName,String _lastName,Phone _phone,Animal _pet,Double _cash,Double _salary){
    this.firstName=_firstName;
    this.lastName=_lastName;
    this.phone=_phone;
    this.pet=_pet;
    this.cash=_cash;
    this.salary=_salary;
    garage=new Car[3];
}
    public Human(String _firstName,String _lastName,Phone _phone,Animal _pet,Double _cash,Double _salary,int _garageSlots){
        this.firstName=_firstName;
        this.lastName=_lastName;
        this.phone=_phone;
        this.pet=_pet;
        this.cash=_cash;
        this.salary=_salary;
        garage=new Car[_garageSlots];
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
public Car getCar(int garagePlace){
    return garage[garagePlace-1];
}
    public boolean getCar(Car car) throws Exception {
        for (int i=0;i< garage.length;i++) {
            if(car==garage[i]) {
                return true;

            }
            else{
                throw new Exception();
            }
        }

        return false;

    }
public void setCar(Car car,int garagePlace){ car=garage[garagePlace-1];}
//public void setCarToNull(){this.car=null;}
//public void canIBuyThisCar(Car car){
//    if(salary>car.value){
//        System.out.println("Congrats, car is yours!");
//        this.car=car;
//    }
//    else if(salary>(car.value/(1/12))){
//        System.out.println("Car has been bought on credit!");
//        this.car=car;
//    }
//    else{
//        System.out.println("LOL go get some job!");
//    }
//}
//    public String toString(){
//    return this.firstName+" "+this.lastName+" "+this.phone+" "+this.car+" "+this.pet+" "+this.salary;
//    }

}
