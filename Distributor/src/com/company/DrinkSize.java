package com.company;

public enum DrinkSize {

    SMALL(1),
    MEDIUM(3),
    LARGE(5);

    public int mililiters;

    DrinkSize(int mililiters) {
        this.mililiters = mililiters;
    }

    public int getMililiters() {
        return mililiters;
    }
}
