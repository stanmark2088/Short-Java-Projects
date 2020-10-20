package com.company;

public abstract class Drink {

    public int drinkVolume;
    public DrinkSize drinkSize;
    public Bottle bottle;

    public Drink(DrinkSize drinkSize){
        this.drinkSize = drinkSize;
    }

    public DrinkSize getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
    }


}
