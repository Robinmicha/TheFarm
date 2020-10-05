package com.Robinfirst;

public class Cow extends Animal{

    int milkAmount = 10;
    int totalMilk = 30;

    public Cow(String name) {
        super(name);
    }

    /**
     * Mjölkar kon
     * @return
     */
    public int milk (){
        if(totalMilk - milkAmount >= 0) {
            totalMilk -= milkAmount;
            return milkAmount;
        }
        else {
            System.out.println(this.name + " Cannot be milked");
            return 0;
        }
    }

}
