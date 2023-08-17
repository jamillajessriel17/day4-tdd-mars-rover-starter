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
            new CommandImplementations(location).move();
        }
        if (givenCommand.equals(Command.TURN_LEFT)) {
            new CommandImplementations(location).turnLeft();
        }
        if (givenCommand.equals(Command.TURN_RIGHT)) {
            new CommandImplementations(location).turnRight();
        }
    }

    public Location getCurrentLocation() {
        return new Location(location.getX(), location.getY(), location.getDirection());
    }
}
