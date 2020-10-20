package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class OfficeWorkers extends Employee {

    public SeniorityLevel seniorityLevel;

    public OfficeWorkers(String name, String groupName,SeniorityLevel seniorityLevel) {
        super(name, groupName);
        this.seniorityLevel = getSeniorityLevel();
        this.monthlySalary = paySalary();
    }

    public SeniorityLevel getSeniorityLevel() {
        return seniorityLevel;
    }

    public void setSeniorityLevel(SeniorityLevel seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }


    public int paySalary() {
        if (this.seniorityLevel == (SeniorityLevel.JUNIOR)) {
            return 1250;
        }
        return 1700;
    }

    public SeniorityLevel getSeniority(){
       if(RandomBooleanValue.randomBooleanValue()){
           return SeniorityLevel.SENIOR;
       }else {
           return SeniorityLevel.JUNIOR;
       }
    }
}
