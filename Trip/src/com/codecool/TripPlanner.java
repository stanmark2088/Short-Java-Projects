package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class TripPlanner {

    List<Location> locationList = new ArrayList<>();

    public TripPlanner() {
    }

    public void addLocation(Location location){
        locationList.add(location);
    }
}
