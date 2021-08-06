package com.afs.tdd;

public class marsRover {
    private static char NORTH = 'N';
    private static char WEST = 'W';
    private static char EAST = 'E';
    private static char SOUTH = 'S';

    public static roverStatus roverStatus;

    public marsRover(com.afs.tdd.roverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public static void executeCommands(String commands) {

        for (int i = 0; i < commands.length(); i++) {
            executeCommand(commands.charAt(i));
        }
    }

    public static void executeCommand(char command) {
        final char commandMove = 'M';
        final char commandLeft = 'L';
        final char commandRight = 'R';
        if (command==commandMove) {
            move();
        } else if (command==commandLeft) {
            turnLeftDirection();
        } else if (command==commandRight) {
            turnRightDirection();
        }
    }

    private static void turnLeftDirection() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final char direction = roverStatus.getDirection();
        char newDirection = direction;
        if (direction == NORTH) {
            newDirection = WEST;
        } else if (direction == SOUTH) {

            newDirection = EAST;
        } else if (direction == WEST) {

            newDirection = SOUTH;
        } else if (direction == EAST) {

            newDirection = NORTH;
        }
        roverStatus = new roverStatus(locationX, locationY, newDirection);
    }

    private static void turnRightDirection() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final char direction = roverStatus.getDirection();
        char newDirection = direction;

        if (direction == NORTH) {
            newDirection = EAST;
        } else if (direction == SOUTH) {

            newDirection = WEST;
        } else if (direction == WEST) {

            newDirection = NORTH;
        } else if (direction == EAST) {

            newDirection = SOUTH;
        }
        roverStatus = new roverStatus(locationX, locationY, newDirection);
    }

    private static void move() {
        final char direction = roverStatus.getDirection();
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        if (direction == NORTH) {
            roverStatus = new roverStatus(locationX, locationY + 1, direction);
        } else if (direction == SOUTH) {
            roverStatus = new roverStatus(locationX, locationY - 1, direction);
        } else if (direction == WEST) {
            roverStatus = new roverStatus(locationX - 1, locationY, direction);
        } else if (direction == EAST) {
            roverStatus = new roverStatus(locationX + 1, locationY, direction);
        }
    }

    public com.afs.tdd.roverStatus getRoverStatus() {
        return roverStatus;
    }
}
