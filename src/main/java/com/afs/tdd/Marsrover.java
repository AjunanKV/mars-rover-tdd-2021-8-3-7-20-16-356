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
        else if(direction.equals("S"))
        {

            newDirection="E";
        }
        else if(direction.equals("W"))
        {

            newDirection="S";
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
        if(direction.equals("W"))
        {

            newDirection="N";
        }
        if(direction.equals("E"))
        {

            newDirection="S";
        }
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
        else if(direction.equals("W")) {
            getRoverStatus = new RoverStatus(locationX-1, locationY, direction);
        }
        else if(direction.equals("E")) {
            getRoverStatus = new RoverStatus(locationX+1, locationY, direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return getRoverStatus;
    }
}
