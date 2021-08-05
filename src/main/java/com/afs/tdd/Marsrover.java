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
        getRoverStatus = new RoverStatus(locationX,locationY, newDirection);
    }

    private static void move() {
        final int locationX = getRoverStatus.getLocationX();;
        final int locationY = getRoverStatus.getLocationY();
        final String direction = getRoverStatus.getDirection();
        getRoverStatus = new RoverStatus(locationX,locationY+ 1, direction);
    }

    public RoverStatus getRoverStatus() {
        return getRoverStatus;
    }
}
