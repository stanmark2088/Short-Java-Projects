package com.codecool;

import java.util.*;

public abstract class Location {
    private final String name;
    private final int xCord;
    private final int yCord;

    public Location(String name, int xCord, int yCord) {
        this.name = name;
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public String getName() {
        return name;
    }

    public int getxCord() {
        return xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public City getClosestCity(List<Location> locations){
        double distance;
        HashMap<Double, City> tempDistance = new HashMap<>();
//        tempDistance.clear();
        for(Location location: locations){
            if(location instanceof City){
                City city = (City) location;
                if(!location.getName().equals(this.getName())){
                    distance = Math.sqrt((location.xCord - this.xCord) * (location.xCord - this.xCord) + (location.yCord - this.yCord) * (location.yCord - this.yCord));
//                    System.out.println(this.getName() + " - " + location.getName() + " " + distance);
                    tempDistance.put(distance, city);
                }
            }
        }
        TreeMap<Double, City> sorted = new TreeMap<>(tempDistance);
//        System.out.println(sorted);
        Object key = sorted.keySet().toArray()[0];
        City value = sorted.get(key);

        System.out.println("The closest city is " + value + " ----> " + key);
        return value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(name);
        return sb.toString();
    }
}
