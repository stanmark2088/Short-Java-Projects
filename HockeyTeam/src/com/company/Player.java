package com.company;

public class Player extends People{

    private int number;
    public PlayerType playerType;

    public Player(String name, String address, int number, PlayerType playerType) {
        super(name, address);
        this.number = number;
        this.playerType = playerType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public enum PlayerType{
        ATTACKER,
        DEFENDER,
        GOALKEEPER;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Player{");
        sb.append("number=").append(number);
        sb.append(", playerType=").append(playerType);
        sb.append('}');
        return sb.toString();
    }
}
