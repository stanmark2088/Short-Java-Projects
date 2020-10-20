package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HockeyTeam {

    public Coach coach;
    public List<Player> playerList = new ArrayList<>();
    public String name;
    public boolean hasCaptain;
    public boolean hasCoach;
    public int win;
    public int loss;
    public int draw;

    public HockeyTeam(Coach coach, List<Player> playerList, String name, boolean hasCaptain, boolean hasCoach, int win, int loss, int draw) {
        this.coach = coach;
        this.playerList = playerList;
        this.name = name;
        this.hasCaptain = teamHasCaptain();
        this.hasCoach = teamHasCoach();
        this.win = win;
        this.loss = loss;
        this.draw = draw;
    }

    public boolean teamHasCoach(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean teamHasCaptain(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasCaptain() {
        return hasCaptain;
    }

    public void setHasCaptain(boolean hasCaptain) {
        this.hasCaptain = hasCaptain;
    }

    public boolean isHasCoach() {
        return hasCoach;
    }

    public void setHasCoach(boolean hasCoach) {
        this.hasCoach = hasCoach;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}
