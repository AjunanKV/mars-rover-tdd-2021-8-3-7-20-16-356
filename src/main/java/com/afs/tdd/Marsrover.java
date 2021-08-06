package com.afs.tdd;

public class Marsrover {
    public static RoverStatus roverStatus;

    public Marsrover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;

    }

    public static void executeCommand(String command) {
        String[] splittedCommand = command.split("");
        for (int i = 0; i < splittedCommand.length; i++)
        {
            if (splittedCommand[i].equals("M")) {
                move();
            } else if (splittedCommand[i].equals("L")) {
                turnLeftDirection();
            } else if (splittedCommand[i].equals("R")) {
                turnRightDirection();
            }
        }

    }


    private static void turnLeftDirection() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;
        if (direction.equals("N"))
        {

            newDirection = "W";
        } else if (direction.equals("S")) {

            newDirection = "E";
        } else if (direction.equals("W")) {

            newDirection = "S";
        } else if (direction.equals("E")) {

            newDirection = "N";
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private static void turnRightDirection() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction; //OON OOE
        if (direction.equals("N")) //switch case
        {
            newDirection = "E";
        }
        if (direction.equals("S")) {

            newDirection = "W";
        }
        if (direction.equals("W")) {

            newDirection = "N";
        }
        if (direction.equals("E")) {

            newDirection = "S";
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private static void move() {
        final String direction = roverStatus.getDirection();
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        if (direction.equals("N")) {
            roverStatus = new RoverStatus(locationX, locationY + 1, direction);
        } else if (direction.equals("S")) {
            roverStatus = new RoverStatus(locationX, locationY - 1, direction);
        } else if (direction.equals("W")) {
            roverStatus = new RoverStatus(locationX - 1, locationY, direction);
        } else if (direction.equals("E")) {
            roverStatus = new RoverStatus(locationX + 1, locationY, direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
