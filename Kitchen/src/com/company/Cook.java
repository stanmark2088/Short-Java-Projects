package com.company;

import java.util.Date;

public class Cook  extends Employee{

    private boolean hasKnife = false;


    public Cook(String name, Date birthday, int salary) {
        super(name, birthday, salary);
    }

    public boolean isHasKnife() {
        return true;
    }

    public void setHasKnife(boolean hasKnife) {
        this.hasKnife = hasKnife;
    }

    public boolean cook(){
        System.out.println("I will start cooking");
        return true;

    }
}
