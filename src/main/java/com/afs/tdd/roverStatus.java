package com.afs.tdd;

public class roverStatus {
    private int locationX;
    private int locationY;
    private char direction;

    public roverStatus(int locationX, int locationY, char direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public char getDirection() {
        return direction;
    }
}
