package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HockeyLeague {

    private final List<HockeyTeam> hockeyTeamList = new ArrayList<>();

    public HockeyLeague() {

    }

    public List<HockeyTeam> getHockeyTeamList() {
        return hockeyTeamList;
    }

    public void addHockeyTeam(HockeyTeam hockeyTeam){
        hockeyTeamList.add(hockeyTeam);
    }
//
//    public List<HockeyTeam> sameCoach(Coach coach){
//        List<HockeyTeam> sameCoachList = new ArrayList<>();
//        for(HockeyTeam team:hockeyTeamList){
//            if(team.isHasCoach() && team.getCoach() == coach){
//                sameCoachList.add(team);
//            }
//        }
//        return sameCoachList;
//    }

    public List<HockeyTeam> sameCoach1() {
        List<HockeyTeam> sameCoachList = new ArrayList<>();
        for (int i = 0; i < hockeyTeamList.size(); i++) {
            Coach tempCoach = hockeyTeamList.get(i).getCoach();
            for(int j = i + 1; j < hockeyTeamList.size(); j++){
                if(tempCoach == hockeyTeamList.get(j).getCoach()){
                    System.out.println(hockeyTeamList.get(i).getCoach().getName());
                    sameCoachList.add(hockeyTeamList.get(i));
                    sameCoachList.add(hockeyTeamList.get(j));
                    System.out.println(hockeyTeamList.get(i).getName());
                    System.out.println(hockeyTeamList.get(j).getName());
                }
            }
        }
//        System.out.println(sameCoachList);
        return sameCoachList;
    }

    public HockeyTeam getTeamsWithMostWins(){
        HockeyTeam victories = hockeyTeamList.get(0);
        for(HockeyTeam team: hockeyTeamList){
            if(team.getWin() > victories.getWin()){
                victories = team;
            }
        }
        return victories;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HockeyLeague{");
        sb.append("hockeyTeamList=").append(hockeyTeamList);
        sb.append('}');
        return sb.toString();
    }
}
