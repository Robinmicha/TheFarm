package com.Robinfirst;

import com.Robinfirst.Animal;

import java.util.ArrayList;

public class Barn {


        ArrayList<Animal> animals = new ArrayList();

    public void addAnimal(Animal kossor){
        animals.add(kossor);
    }

    public Animal getCow(String name){
        Animal cow = null;

        for (Animal animal: animals) {
            if (animal.name.equals(name)){
                cow = animal;
            }
        }

        return cow;
    }
}
