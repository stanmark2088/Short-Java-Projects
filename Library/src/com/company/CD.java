package com.company;

public class CD extends Item {

    public int numberOfTracks;

    public CD(String name, Date date, int numberOfTracks) {
        super(name, date);
        this.numberOfTracks = numberOfTracks;
    }

}
