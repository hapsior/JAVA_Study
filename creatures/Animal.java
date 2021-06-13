package com.company.creatures;

import com.company.Human;
import com.company.creatures.Feedable;
import com.company.salleable;

public abstract class Animal implements salleable, Feedable {
    final public String species;
    private Double weight;
    public String name;

    public Animal(String species) {
        this.species = species;
        switch (this.species) {
            case "dog":
                this.weight = 10.2;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "mouse":
                this.weight = 0.01;
                break;
            case "cow":
                this.weight=150.0;
                break;
            default:
                this.weight = 1.0;
        }
    }

    public void feed() {
        if (this.weight > 0) {
            this.weight *= 1.1;
            System.out.println("thx for food");
        } else {
            System.out.println("Now it is too late!");
        }
    }
    public void feed(double foodWeight){
        if (this.weight > 0) {
            this.weight += foodWeight;
            System.out.println("thx for food");
        } else {
            System.out.println("Now it is too late!");
        }
    }
    public void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 1.0;
            System.out.println("Thx for a walk, my weight now is: " + this.weight);
        } else {
            System.out.println("Now it is too late!");
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    void printName() {
        System.out.println(this.name);
    }

    void printNameAndOwner(String owner) {
        System.out.println(owner + " has " + this.name);
    }
    public String toString(){
        return this.name+" "+this.weight+" "+this.species;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != null && buyer.cash > price) {
            buyer.pet = seller.pet;
            seller.pet = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.firstName + " bought pet from " + seller.firstName);
        }
        else{
            System.out.println(buyer.firstName+" doesnt have enough money or pet doesnt exist");
        }
    }

}
