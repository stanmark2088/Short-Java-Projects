package com.company;

import java.util.ArrayList;
import java.util.List;

public class HockeyLeague {

    public List<HockeyTeam> hockeyTeamList = new ArrayList<>();

    public HockeyLeague(List<HockeyTeam> hockeyTeamList) {
        this.hockeyTeamList = hockeyTeamList;
    }

    public List<HockeyTeam> getHockeyTeamList() {
        return hockeyTeamList;
    }

    public void setHockeyTeamList(List<HockeyTeam> hockeyTeamList) {
        this.hockeyTeamList = hockeyTeamList;
    }

    public void addTeam(HockeyTeam hockeyTeam){
        hockeyTeamList.add(hockeyTeam);

    }

    public List<HockeyTeam> sameCoach(){
        List<HockeyTeam> sameCoachList = new ArrayList<>();

        for (int i = 0; i < hockeyTeamList.size();i++){
            Coach tempCoach = hockeyTeamList.get(i).getCoach();
            for(int j = i + 1; j < hockeyTeamList.size();j++){
                if(tempCoach == hockeyTeamList.get(j).getCoach()){
                    System.out.println(hockeyTeamList.get(i).getCoach().getName());
                    sameCoachList.add(hockeyTeamList.get(i));
                    sameCoachList.add(hockeyTeamList.get(j));
                    System.out.println(hockeyTeamList.get(i).getName());
                    System.out.println(hockeyTeamList.get(j).getName());
                }
            }

        }
        return sameCoachList;
    }

    public HockeyTeam getTeamWithMostWins(){
        HockeyTeam winningTeam = hockeyTeamList.get(0);

        for(HockeyTeam team: hockeyTeamList){
            if(team.getWin() > winningTeam.getWin()){
                winningTeam = team;
            }
        }
        return winningTeam;
    }
}
