package com.company;
// A Pen should have (2) properties: a collection of Animals and a collection of BabyAnimals.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pen {
    private String name;
    private List<Animal> animals = new ArrayList<>();
    private List<BabyAnimal> babyAnimals = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);


    public Pen(String name) {
        this.name = name;
    }

    public void addAnimalToPen(Animal animal) {
        animals.add(animal);
        System.out.println(animals.size());
    }

    public void addBabyAnimalToPen(BabyAnimal babyAnimal) {
        babyAnimals.add(babyAnimal);
        System.out.println(babyAnimals.size());
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", animals=" + animals +
                ", babyAnimals=" + babyAnimals +
                '}';
    }

    public void showAllAnimals() {
        for(int i = 0; i < animals.size(); i++){
            for(int j = 0; j < babyAnimals.size(); j++) {
                System.out.println(animals.get(i) + "\n " + babyAnimals.get(j));
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
