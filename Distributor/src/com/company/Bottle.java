package com.company;

public class Bottle {

    public int bottleVolume = 20;
    public int currentLevel;

    public Bottle(int bottleVolume, int currentLevel) {
        this.bottleVolume = bottleVolume;
        this.currentLevel = currentLevel;
    }

    public int getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(int bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }


}

