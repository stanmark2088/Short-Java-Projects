package com.company;

public class Coach extends People{

    public int yearsExperience;

    public Coach(String name, String address, int yearsExperience) {
        super(name, address);
        this.yearsExperience = yearsExperience;
    }
}
