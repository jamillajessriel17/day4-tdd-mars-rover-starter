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

    //TODO: create a local variable for new CommandImplementation since all the cases use it for less redundancy
    public void executeCommand(Command givenCommand) {
        switch (givenCommand) {
            case MOVE:
                new CommandImplementations(location).move();
                break;
            case TURN_LEFT:
                new CommandImplementations(location).turnLeft();
                break;
            case TURN_RIGHT:
                new CommandImplementations(location).turnRight();
                break;
        }
    }

    public Location getCurrentLocation() {
        return new Location(location.getX(), location.getY(), location.getDirection());
    }
}
