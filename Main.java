package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.name = "Szarik";

        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        Car car = new Car("Accord","Honda","Black",1999,2000);

        Human damian = new Human();
        damian.firstName = "Damian";
        damian.lastName = "Hapka";
        damian.pet = dog;
        damian.setSalary(4000.00);


        damian.canIBuyThisCar(car);
    }
}
