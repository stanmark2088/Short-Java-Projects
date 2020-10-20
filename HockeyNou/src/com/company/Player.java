package com.company;

public class Player extends People{

    public PlayerPosition playerPosition;
    public int number;

    public Player(String name, String address, PlayerPosition playerPosition, int number) {
        super(name, address);
        this.playerPosition = playerPosition;
        this.number = number;
    }
}
