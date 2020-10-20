package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class UserLocation {

    private int userXCord;
    private int userYCord;
    private final List<Location> historyList = new ArrayList<>();

    public UserLocation(int userXCord, int userYCord) {
        this.userXCord = userXCord;
        this.userYCord = userYCord;
    }

    public void addLocationToHistoryList(Location location){
        if(userXCord == location.getxCord() && userYCord == location.getyCord()){
            historyList.add(location);
        }
    }

    public int getUserXCord() {
        return userXCord;
    }

    public void setUserXCord(int userXCord) {
        this.userXCord = userXCord;
    }

    public int getUserYCord() {
        return userYCord;
    }

    public void setUserYCord(int userYCord) {
        this.userYCord = userYCord;
    }

    public List<Location> getHistoryList() {
        return historyList;
    }

    public void goTo(Location location){
        setUserXCord(location.getxCord());
        setUserYCord(location.getyCord());
        addLocationToHistoryList(location);
        System.out.println("I'v just been in " + location.getName());
    }
}
