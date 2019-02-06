package com.company;
// A Zoo should have (1) property: a collection of Pens.

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Pen> pens = new ArrayList<>();

    public List<Pen> getPens() {
        return pens;
    }

    public void setPens(List<Pen> zooPens) {
        this.pens = pens;
    }
}
