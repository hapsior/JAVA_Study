package com.company.creatures;

public class FarmAnimal extends Animal implements edbile {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Animal was be eaten");
    }
}
