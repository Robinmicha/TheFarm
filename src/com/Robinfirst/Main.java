package com.Robinfirst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Farmer benny = new Farmer("Benny");
    benny.barn.addAnimal(new Cow("Beatrice"));
    Farmer sigrid = new Farmer("Sigrid");
    sigrid.barn.addAnimal(new Cow("Rosa"));

        System.out.println(sigrid.milkCan);
        sigrid.toMilk("Rosa");
        System.out.println(sigrid.milkCan);
        sigrid.toMilk("Rosa");
        System.out.println(sigrid.milkCan);
        sigrid.toMilk("Rosa");

        System.out.println(benny.milkCan);
    benny.toMilk("Beatrice");
        System.out.println(benny.milkCan);
        benny.toMilk("Beatrice");
        System.out.println(benny.milkCan);
        benny.toMilk("Beatrice");
        System.out.println(benny.milkCan);
        benny.toMilk("Beatrice");
        System.out.println(benny.milkCan);

    }
}
