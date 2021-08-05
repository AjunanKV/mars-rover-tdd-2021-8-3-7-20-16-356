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
