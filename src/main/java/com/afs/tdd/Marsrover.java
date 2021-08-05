package com.afs.tdd;

public class Marsrover {

    public static RoverStatus getRoverStatus;

    public Marsrover(RoverStatus roverStatus) {
        this.getRoverStatus = roverStatus;

    }

    public static void executeCommand(String command) {
        if(command.equals("M"))
        {
            move();
        }
        else if(command.equals("R"))
        {
            turnRightDirection();
        }
        else if(command.equals("L"))
        {
            turnLeftDirection();
        }
    }

    private static void turnLeftDirection() {
        final int locationX = getRoverStatus.getLocationX();;
        final int locationY = getRoverStatus.getLocationY();
        final String direction = getRoverStatus.getDirection();
        String newDirection = direction;
        if(direction.equals("N"))
        {

            newDirection="W";
        }
        getRoverStatus = new RoverStatus(locationX,locationY, newDirection);
    }

    private static void turnRightDirection() {
        final int locationX = getRoverStatus.getLocationX();;
        final int locationY = getRoverStatus.getLocationY();
        final String direction = getRoverStatus.getDirection();
        String newDirection = direction;
        if(direction.equals("N"))
        {

            newDirection="E";
        }
        if(direction.equals("S"))
        {

            newDirection="W";
        }
        getRoverStatus = new RoverStatus(locationX,locationY, newDirection);
        getRoverStatus = new RoverStatus(locationX,locationY, newDirection);
    }

    private static void move() {
        final String direction = getRoverStatus.getDirection();
        final int locationX = getRoverStatus.getLocationX();
        final int locationY = getRoverStatus.getLocationY();
        if (direction.equals("N")) {
            getRoverStatus = new RoverStatus(locationX, locationY + 1, direction);
        }
        else if(direction.equals("S")) {
            getRoverStatus = new RoverStatus(locationX, locationY -1, direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return getRoverStatus;
    }
}
