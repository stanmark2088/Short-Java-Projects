package com.codecool;

public class Landmark extends Location{
    private int entranceFee;

    public Landmark(String name, int xCord, int yCord) {
        super(name, xCord, yCord);
    }

    public int getEntranceFee() {
        return entranceFee;
    }

    public void setEntranceFee(int entranceFee) {
        if(entranceFee >= 0)
            this.entranceFee = entranceFee;
        else System.out.println("money money money!");

    }


}
