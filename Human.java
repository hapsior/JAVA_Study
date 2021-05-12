package com.company;

public class Human {
String firstName;
String lastName;
Phone phone;
Animal pet;
Car car;
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
    }

}
}
