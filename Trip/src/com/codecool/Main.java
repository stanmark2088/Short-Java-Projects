package com.codecool;

import java.util.List;

public class Main {

    public static void trip(UserLocation userLocation, List<Location> locationList){
        for(int i = 0; i < 10; i++) {
            userLocation.getHistoryList().get(userLocation.getHistoryList().size() - 1).getClosestCity(locationList);
            userLocation.goTo(userLocation.getHistoryList().get(userLocation.getHistoryList().size() - 1).getClosestCity(locationList));
        }
    }


    public static void main(String[] args) {
	// write your code here
        TripPlanner firstTripPlanner = new TripPlanner();

        City city1 = new City("Bucuresti", 10, 20);
        City city2 = new City("Bacau", 50, 10);
        City city3 = new City("Constanta", 150, 30);

        Landmark landmark1 = new Landmark("Arcul de triumf", 20, 10);
        Landmark landmark2 = new Landmark("Lacul Rosu", 60, 90);
        Landmark landmark3 = new Landmark("Babele", 80, 150);
        landmark1.setEntranceFee(25);
        landmark1.setEntranceFee(34);
        landmark1.setEntranceFee(56);

        firstTripPlanner.locationList.add(city1);
        firstTripPlanner.locationList.add(city2);
        firstTripPlanner.locationList.add(city3);
        firstTripPlanner.locationList.add(landmark1);
        firstTripPlanner.locationList.add(landmark2);
        firstTripPlanner.locationList.add(landmark3);

        UserLocation userLocation1 = new UserLocation(78, 64);
//        userLocation1.goToLocation(landmark2);
//        userLocation1.goToLocation(landmark2.getClosestCity(locationslist));
//        city2.getClosestCity(firstTripPlanner.locationList);
        userLocation1.goTo(landmark2);
        landmark3.getClosestCity(firstTripPlanner.locationList);

//        trip(userLocation1, firstTripPlanner.locationList);


    }
}
