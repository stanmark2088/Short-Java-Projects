package com.company;

import java.util.Random;

public class Game {

    private String location;

    public Game() {
    }

    public void simulateGame(HockeyTeam a, HockeyTeam b) {

        int homeScore = new Random().nextInt(10);
        int guestScore = new Random().nextInt(10);
        System.out.println(a.getName() + " ("+ homeScore +")"  + " - "+ "("+ guestScore +") " + b.getName());

        if (homeScore > guestScore) {
            a.addWins(1);
            b.addLosses(1);
        } else if (homeScore < guestScore){
            b.addWins(1);
            a.addLosses(1);
        }
        else{
            a.addDraws(1);
            b.addDraws(1);
        }
    }

}
