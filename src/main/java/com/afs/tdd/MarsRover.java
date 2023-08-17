package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeBatchCommands(List<Command> commandList) {
        commandList.forEach(this::executeCommand);
    }

    public void executeCommand(Command givenCommand) {
        if (givenCommand.equals(Command.MOVE)) {
            move();
        }
        if (givenCommand.equals(Command.TURN_LEFT)) {
            turnLeft();
        }
        if (givenCommand.equals(Command.TURN_RIGHT)) {
            turnRight();
        }
    }

    public void move() {
        switch (location.getDirection()) {
            case NORTH:
                location.setY(location.getY() + 1);
                break;
            case SOUTH:
                location.setY(location.getY() - 1);
                break;
            case EAST:
                location.setX(location.getX() + 1);
                break;
            case WEST:
                location.setX(location.getX() - 1);
                break;

        }
    }

    public void turnLeft() {

        switch (location.getDirection()) {
            case NORTH:
                location.setDirection(Direction.WEST);
                break;
            case SOUTH:
                location.setDirection(Direction.EAST);
                break;
            case EAST:
                location.setDirection(Direction.NORTH);
                break;
            case WEST:
                location.setDirection(Direction.SOUTH);
                break;
        }
    }

    public void turnRight() {
        switch (location.getDirection()) {
            case NORTH:
                location.setDirection(Direction.EAST);
                break;
            case SOUTH:
                location.setDirection(Direction.WEST);
                break;
            case EAST:
                location.setDirection(Direction.SOUTH);
                break;
            case WEST:
                location.setDirection(Direction.NORTH);
                break;
        }
    }

    public Location getCurrentLocation() {
        return new Location(location.getX(), location.getY(), location.getDirection());
    }
}
