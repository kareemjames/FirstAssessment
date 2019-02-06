package com.company;
// A Pen should have (2) properties: a collection of Animals and a collection of BabyAnimals.

import java.util.ArrayList;
import java.util.List;

public class Pen {
    private List<Animal> animals = new ArrayList<>();
    private List<BabyAnimal> babyAnimals = new ArrayList<>();

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<BabyAnimal> getBabyAnimals() {
        return babyAnimals;
    }

    public void setBabyAnimals(List<BabyAnimal> babyAnimals) {
        this.babyAnimals = babyAnimals;
    }
}
