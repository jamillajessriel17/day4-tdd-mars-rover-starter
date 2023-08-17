package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeBatchCommands(List<Command> commandList){

    }

    public void executeCommand(Command givenCommand) {
        if (givenCommand == Command.MOVE) {
            if (location.getDirection() == Direction.NORTH) {
                location.setY(location.getY() + 1);
            }
            if (location.getDirection() == Direction.SOUTH) {
                location.setY(location.getY() - 1);
            }
            if (location.getDirection() == Direction.EAST) {
                location.setX(location.getX() + 1);
            }
            if (location.getDirection() == Direction.WEST) {
                location.setX(location.getX() - 1);
            }
        }
        if (givenCommand.equals(Command.TURN_LEFT)) {

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
        if (givenCommand.equals(Command.TURN_RIGHT)) {
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
    }

    public Location getCurrentLocation() {
        return new Location(location.getX(), location.getY(), location.getDirection());
    }
}
