package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("sffda", "dadasd", 7, Player.PlayerType.ATTACKER);
        Player p2 = new Player("sffda", "dadasd", 5, Player.PlayerType.ATTACKER);
        Player p3 = new Player("sffda", "dadasd", 7, Player.PlayerType.ATTACKER);
        Player p4 = new Player("sffda", "dadasd", 7, Player.PlayerType.ATTACKER);
        Player p5 = new Player("sffda", "dadasd", 7, Player.PlayerType.ATTACKER);
        Player p6 = new Player("sffda", "dadasd", 7, Player.PlayerType.ATTACKER);

        Coach sorin = new Coach("sorin", "jhgv jhv", Coach.AccrediationType.EXPERT, 12);
        Coach nonu = new Coach("nonu", "jhgv jhv", Coach.AccrediationType.EXPERT, 12);


        HockeyTeam MightyDucks = new HockeyTeam(sorin, Arrays.asList(p1, p2, p3, p4, p5, p6), true, true, "mighty ducks");
        HockeyTeam Steaua = new HockeyTeam(sorin, Arrays.asList(p1, p2, p3, p4, p5, p6), true, true, "steaua");
        HockeyTeam Dinamo = new HockeyTeam(nonu, Arrays.asList(p1, p2, p3, p4, p5, p6), true, true, "dinamo");
        HockeyTeam MiercureaCiuc = new HockeyTeam(nonu, Arrays.asList(p1, p2, p3, p4, p5, p6), true, true, "miercurea ciuc");

        HockeyLeague Liga1 = new HockeyLeague();
        Liga1.addHockeyTeam(MightyDucks);
        Liga1.addHockeyTeam(Steaua);
        Liga1.addHockeyTeam(Dinamo);
        Liga1.addHockeyTeam(MiercureaCiuc);

//        System.out.println(Liga1.getTeamsWithMostWins().getName() + " - " + Liga1.getTeamsWithMostWins().getWin()) ;
//
//        for(HockeyTeam team : Liga1.getHockeyTeamList()){
//            System.out.println(team.getName() + " " + team.getWin());
//        }
//
//        System.out.println("The teams are:");
//
//        for(HockeyTeam team : Liga1.sameCoach(sorin)){
//            System.out.println(team.getName());
//        }
//
//
        Game simulate = new Game();
        for(int i = 0; i < Liga1.getHockeyTeamList().size(); i++){
            for(int j = 0; j < Liga1.getHockeyTeamList().size(); j++){
                if(i != j){
                    simulate.simulateGame(Liga1.getHockeyTeamList().get(i), Liga1.getHockeyTeamList().get(j));
                }
            }
        }

        for(HockeyTeam team : Liga1.getHockeyTeamList()){
            System.out.println(team.getName() + " " + team.getRecord());
        }

        for(HockeyTeam team : Liga1.getHockeyTeamList()){
            System.out.println(team.getName() + " " + team.getWin());
        }

//        for(HockeyTeam team : Liga1.sameCoach(nonu)){
//            System.out.println(team.getName());
//        }

//        System.out.println(Liga1.sameCoach1().listIterator());
        Liga1.sameCoach1();

    }
}