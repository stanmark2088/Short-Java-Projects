package com.company;

import java.util.Date;
import java.util.Random;

public class Chef extends Employee {

    private  boolean hasKnife = false;

    public Chef(String name, Date birthday, int salary) {
        super(name, birthday, salary);
    }

    public boolean isHasKnife() {
        return true;
    }

    public void setHasKnife(boolean hasKnife) {
        this.hasKnife = hasKnife;
    }

    public boolean yell(){
        System.out.println("Start cooking!");
        return true;
    }

    public IngredientType receieveRandomINgredient(){
        int randomIngredient = new Random().nextInt(IngredientType.values().length);
        return IngredientType.values()[randomIngredient];
    }
}
