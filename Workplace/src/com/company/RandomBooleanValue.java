package com.company;

import java.util.Random;

public class RandomBooleanValue {

    public static boolean randomBooleanValue(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
