package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ColdNormalDrink cnd1 = new ColdNormalDrink(DrinkSize.LARGE);
        ColdNormalDrink cnd2 = new ColdNormalDrink(DrinkSize.MEDIUM);

        HotNormalDrink hnd = new HotNormalDrink(DrinkSize.LARGE);
        ColdFizzyDrink cfd = new ColdFizzyDrink(DrinkSize.LARGE);

        Student mark = new Student(true);
        Bottle  sticla =  new Bottle(20,4);


        Distributor d1 = new Distributor(Arrays.asList(cnd1,cfd,cnd2,hnd));

        System.out.println(mark.getADrink(cnd1,sticla));





    }
}
