package com.company;

import java.util.Date;
import java.util.Random;

public class Helper extends Employee {

    private int potatoQuantity = new Random().nextInt(4);
    private int meatQuantity = new Random().nextInt(4);
    private int carrotQuantity = new Random().nextInt(4);

    public IngredientType ingredientType;

    public Helper(String name, Date birthday, int salary, IngredientType ingredientType) {
        super(name, birthday, salary);
        this.ingredientType = ingredientType;
    }


    public IngredientType getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    public void giveIngredient(IngredientType ingredientType){
        if(ingredientType == IngredientType.CARROT){
            if(carrotQuantity > 0){
                carrotQuantity -= 1;
                System.out.println("Here is the carrot");
            }else{
                System.out.println("We are out of carrots");
            }
        }else if(ingredientType == IngredientType.MEAT){
            if(meatQuantity > 0){
                meatQuantity -= 1;
                System.out.println("Here is the meat");
            }else{
                System.out.println("We are out of meat");
            }
        }else if(ingredientType == IngredientType.POTATO) {
            if (potatoQuantity > 0) {
               potatoQuantity -= 1;
                System.out.println("Here is the potato");
            } else {
                System.out.println("We are out of potatoes");
            }
        }
    }

    public int getPotatoQuantity() {
        return potatoQuantity;
    }

    public int getMeatQuantity() {
        return meatQuantity;
    }

    public int getCarrotQuantity() {
        return carrotQuantity;
    }
}
