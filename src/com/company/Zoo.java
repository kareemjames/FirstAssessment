package com.company;
// A Zoo should have (1) property: a collection of Pens.

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Pen> pens = new ArrayList<>();

    public void addPen(Pen pen) {
        pens.add(pen);
        System.out.println(pens.size());
        System.out.println("this is running");
        System.out.println(pen);
    }

    public Pen singlePen(String name) {
        Pen singlePen = null;
        for(int i = 0; i < pens.size(); i++) {
            if(pens.get(i).getName().equalsIgnoreCase(name)) {
                singlePen = pens.get(i);
                System.out.println("You have choosen " + singlePen.getName() + " pen ");
            } else {
                System.out.println("No matches found");
            }
        }
        return singlePen;
    }

    public void viewAllPens() {
        for(int i = 0; i < pens.size(); i++) {
            System.out.println(pens.get(i));
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "pens=" + pens +
                '}';
    }

    public List<Pen> getPens() {
        return pens;
    }

    public void setPens(List<Pen> zooPens) {
        this.pens = pens;
    }
}
