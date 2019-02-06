package com.company;
// BabyAnimal should inherit from Animal and should have at least (1) additional instance variable. BabyAnimal should have a parameterized constructor that calls its superclass to construct part of a BabyAnimal object.

public class BabyAnimal extends Animal {
    private String preferredFood;

    public BabyAnimal(String species, String size, String gender, String preferredFood) {
        super(species, size, gender);
        this.preferredFood = preferredFood;
    }

    public String getPreferredFood() {
        return preferredFood;
    }

    public void setPreferredFood(String preferredFood) {
        this.preferredFood = preferredFood;
    }
}
