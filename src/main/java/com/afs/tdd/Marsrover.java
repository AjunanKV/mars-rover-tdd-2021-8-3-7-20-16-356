package com.afs.tdd;

public class Marsrover {
//NORTH SOUTH WEST EAST
    public static RoverStatus RoverStatus; //RoverStatus

    public Marsrover(RoverStatus roverStatus) {
        this.RoverStatus = roverStatus;

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
        final int locationX = RoverStatus.getLocationX();
        final int locationY = RoverStatus.getLocationY();
        final String direction = RoverStatus.getDirection();
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
        RoverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private static void turnRightDirection() {
        final int locationX = RoverStatus.getLocationX();
        final int locationY = RoverStatus.getLocationY();
        final String direction = RoverStatus.getDirection();
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
        RoverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private static void move() {
        final String direction = RoverStatus.getDirection();
        final int locationX = RoverStatus.getLocationX();
        final int locationY = RoverStatus.getLocationY();
        if (direction.equals("N")) { //00N 0 1N
            RoverStatus = new RoverStatus(locationX, locationY + 1, direction);
        } else if (direction.equals("S")) {
            RoverStatus = new RoverStatus(locationX, locationY - 1, direction);
        } else if (direction.equals("W")) {
            RoverStatus = new RoverStatus(locationX - 1, locationY, direction);
        } else if (direction.equals("E")) {
            RoverStatus = new RoverStatus(locationX + 1, locationY, direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return RoverStatus;
    }
}
