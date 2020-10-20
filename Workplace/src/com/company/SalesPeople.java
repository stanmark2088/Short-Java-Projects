package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SalesPeople extends Employee {


    public SalesPeople(String name, String groupName) {
        super(name, groupName);
        this.monthlySalary = ThreadLocalRandom.current().nextInt(1500,2000);
    }

    @Override
    public int getMonthlySalary() {
        return ThreadLocalRandom.current().nextInt(1500,2000);
    }
}
