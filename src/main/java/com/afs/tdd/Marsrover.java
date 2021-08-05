package com.afs.tdd;

public class Marsrover {

    public static RoverStatus getRoverStatus;

    public Marsrover(RoverStatus roverStatus) {
        this.getRoverStatus = roverStatus;

    }

    public static void executeCommand(String command) {

    }
    public RoverStatus getRoverStatus() {
        return getRoverStatus;
    }
}
