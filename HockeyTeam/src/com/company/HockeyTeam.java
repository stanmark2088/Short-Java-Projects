package com.company;

import java.util.ArrayList;
import java.util.List;

public class HockeyTeam {
    private Coach coach;
    private List<Player> playerList = new ArrayList<>();
    private boolean captain;
    private boolean hasCoach;
    private String name;
    private int win ;
    private int draw ;
    private int loss ;



    public HockeyTeam(Coach coach, List<Player> playerList, boolean captain, boolean hasCoach, String name) {
        this.coach = coach;
        this.playerList = playerList;
        this.captain = captain;
        this.hasCoach = hasCoach;
        this.name = name;

    }

    public void addWins(int x){
        this.win += x;
    }
    public void addDraws(int x){
        this.draw += x;
    }
    public void addLosses(int x){
        this.loss += x;
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

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public boolean isHasCoach() {
        return hasCoach;
    }

    public void setHasCoach(boolean hasCoach) {
        this.hasCoach = hasCoach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }


    public void addPlayer(Player player){
        playerList.add(player);
    }

    public String getRecord() {
        return getWin() + " - " + getDraw() + " - " + getLoss();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HockeyTeam{");
        sb.append("coach=").append(coach);
        sb.append(", playerList=").append(playerList);
        sb.append(", captain=").append(captain);
        sb.append(", hasCoach=").append(hasCoach);
        sb.append(", name='").append(name).append('\'');
        sb.append(", win=").append(win);
        sb.append(", draw=").append(draw);
        sb.append(", loss=").append(loss);
        sb.append('}');
        return sb.toString();
    }
}
