package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

    Restaurant pergola  = new Restaurant();

    Cook sorin = new Cook("Sorin", new Date(1945,4,21),2500);
    Cook nonu = new Cook("Nonu", new Date(1945,5,2),2500);

    Helper florin = new Helper("Florin",new Date(1988,9,10),1900,IngredientType.CARROT);
    Helper iulian = new Helper("Iulian",new Date(1988,5,10),1900,IngredientType.MEAT);
    Helper andreea = new Helper("Andreea",new Date(1987,3,5),1900,IngredientType.CARROT);

    Chef mark = new Chef("Mark",new Date(1988,8,9),40000);

    pergola.addCook(sorin);
    pergola.addCook(nonu);

    pergola.addHelper(florin);
    pergola.addHelper(iulian);
    pergola.addHelper(andreea);

    pergola.setChef(mark);

    sorin.isHasKnife();
    nonu.isHasKnife();

    mark.isHasKnife();

    if(mark.yell()){
        for(Helper helper : pergola.getHelperList()){
            helper.giveIngredient(mark.receieveRandomINgredient());
            System.out.println(helper.getCarrotQuantity());
            System.out.println(helper.getMeatQuantity());
            System.out.println(helper.getPotatoQuantity());
        }
    }



    }
}
