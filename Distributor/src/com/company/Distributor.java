package com.company;

import java.util.ArrayList;
import java.util.List;

public class Distributor {

    private static int temperature = 0;
    List<Drink> drinkList = new ArrayList<>();


    public Distributor(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }



    public int changeTemperature(Drink drink){
        int temperature = 0;
        for(Drink drink:drinkList ){
            if(drink instanceof ColdFizzyDrink){
                ColdFizzyDrink coldFizzyDrink = (ColdFizzyDrink) drink;
                switch (coldFizzyDrink.getDrinkSize()){
                    case SMALL:
                        temperature += 1;
                    case MEDIUM:
                        temperature += 3 * 3;
                    case LARGE:
                        temperature += 5 * 5;
                }
            }else if(drink instanceof ColdNormalDrink){
                ColdNormalDrink coldNormalDrink = (ColdNormalDrink) drink;
                switch (coldNormalDrink.getDrinkSize()){
                    case SMALL:
                        temperature += -2;
                    case MEDIUM:
                        temperature += 3 * (3 * (-2));
                    case LARGE:
                        temperature += 5 * (5 * (-2));
                }
            }else if(drink instanceof HotNormalDrink){
                HotNormalDrink hotNormalDrink = (HotNormalDrink) drink;
                switch (hotNormalDrink.getDrinkSize()){
                    case SMALL:
                        temperature += 3;
                    case MEDIUM:
                        temperature += 3 * (3 * 3);
                    case LARGE:
                        temperature += 5 * (5 * 3);
                }
            }
        }
        return temperature;

    }

    public void keepTrackOfTemperature(int temperature){
        if(temperature > 90){
            System.out.println("This machine is out of order");
        }
    }



}
