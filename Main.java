package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal dog = new Pet("dog");
        Device phone = new Phone("Nokia","3310",1999,2500.0);
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

        Human damian = new Human("Damian","Hao", (Phone) phone,dog,3000.00,4000.00,4);

       // damian.canIBuyThisCar(car);

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

        Human jacek=new Human("Jacek","Bania", (Phone) phone,dog,3000.00,4000.00,6);




        dog.feed();
        dog.feed(1.5);
        Animal cow=new FarmAnimal("cow");
        cow.feed(20);
        System.out.println(cow.getWeight());
        ((FarmAnimal)cow).beEaten();


        ((Phone) phone).installAnnApp("Snapchat");
        ((Phone) phone).installAnnApp("Snapchat","Facebook","Chrome");
        car.refuel();
        Phone motorola=new Phone("Motorola","GX",2012,3000.00);
        Human jack = new Human("Jackie","Chan",motorola,cow,10000.00,3000.00,4);
        Car suzuki=new LPG("Swift","Suzuki","black",2009,5000.0);
        Car bmw=new LPG("e36","BMW","green",1996,1500.00);
        Car audi=new Diesel("A6", "AUDI", "silver", 2009, 5000.00);
        jack.SetCar(suzuki,1);
        jack.SetCar(bmw,2);
        jack.SetCar(audi,3);
        damian.SetCar(car,1);
        System.out.println(jack.CountValueOfYourCars());
        car.carOwners=new ArrayList<>();
        car.carOwners.add(damian);
        System.out.println((Arrays.toString(jack.SortCarsFromOldest())));
        car.sell(damian,jacek,2000.00);
        System.out.println(car.CheckLastOwner(jacek,car.carOwners));
         System.out.println(car.CheckLastOwner(damian,car.carOwners));

        System.out.println(car.IsHeSoldHim(damian,jacek,car.carOwners));
        System.out.println(car.WasOwnerAnytime(damian,car.carOwners));
    }
}
