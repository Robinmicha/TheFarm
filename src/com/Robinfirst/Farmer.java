package com.Robinfirst;

public class Farmer extends Person {

    int milkCan = 0;
    Barn barn = new Barn();

    public Farmer(String name) {
        super(name);
    }

    public void toMilk (String name){
        Cow milkee = (Cow)barn.getCow(name);
        milkCan += milkee.milk();
    }
}
