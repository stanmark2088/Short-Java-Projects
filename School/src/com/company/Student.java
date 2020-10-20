package com.company;

import java.util.Date;

public class Student extends Person {

    public int progression;
    public Module module = Module.PROBASICS;

    public Student(String name, Date birthday, String phoneNumber) {
        super(name, birthday, phoneNumber);
    }

    public void showCurrentProgress(){
        System.out.println("progress : " + progression);
    }

    public int getProgression() {
        return progression;
    }

    public void setProgression(int progression) {
        this.progression = progression;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public enum Module{
        PROBASICS,
        WEB,
        OOP,
        ADVANCED};

}
