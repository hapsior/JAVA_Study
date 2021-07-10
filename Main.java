package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Pet("dog");
        Phone phone = new Phone();
        phone.producer = "Nokia";
        phone.model = "3000";
        phone.os = "Symbian";
        phone.screenSize = 4;
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

        Car car = new Diesel("Accord", "Honda", "Black", 1999, 2000) {

        };
        Car car2 = new LPG("Mondeo", "Ford", "White", 2004, 2000);

        Human damian = new Human();
        damian.firstName = "Damian";
        damian.lastName = "Hapka";
        damian.pet = dog;
        damian.setSalary(4000.00);
        damian.setCar(car);
        damian.cash=damian.getSalary();
        damian.canIBuyThisCar(car);

        boolean isHashCodeEquals = car.hashCode() == car2.hashCode();
        if (isHashCodeEquals && car.equals(car2)) {
            System.out.println("Cars are the same object");
        } else {
            System.out.println("Cars are not the same object");
        }

        System.out.println(dog);
        System.out.println(car.color + " " + car2.color);

        System.out.println(car.toString());
        System.out.println(damian.toString());
        System.out.println(phone.toString());
        System.out.println(dog.toString());

        System.out.println(car.turnOn());
        System.out.println(car.toString());

        Human jacek=new Human();
        jacek.firstName="Jacek";
        jacek.lastName="Bania";
        jacek.setSalary(5000.00);

        car.sell(damian,jacek,2000.00);

        dog.feed();
        dog.feed(1.5);
        Animal cow=new FarmAnimal("cow");
        cow.feed(20);
        System.out.println(cow.getWeight());
        ((FarmAnimal)cow).beEaten();


        phone.installAnnApp("Snapchat");
        phone.installAnnApp("Snapchat","Facebook","Chrome");
        car.refuel();
    }
}
