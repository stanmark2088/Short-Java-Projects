package com.company;

public class Student {

    public boolean hasBottleWater;
    public int tempVolume = 0;

    public Student(boolean hasBottleWater) {
        this.hasBottleWater = hasBottleWater;
    }

    public boolean HasBottleWater() {
        return true;
    }

    public void setHasBottleWater(boolean hasBottleWater) {
        this.hasBottleWater = hasBottleWater;
    }

    public boolean getADrink(Drink drink, Bottle bottle){
        tempVolume = bottle.currentLevel + drink.getDrinkSize().getMililiters();
        if(hasBottleWater){
            if(tempVolume < bottle.bottleVolume);
            System.out.println("The drink can fit in the bottle");
            return true;
        }
        System.out.println("The drink cannot fit in the bottle");
        return false;
    }
}
