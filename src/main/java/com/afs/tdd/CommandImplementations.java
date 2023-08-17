package com.afs.tdd;

public class CommandImplementations {
    private final Location location;

    public CommandImplementations(Location location) {
        this.location = location;
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
                setDirection(Direction.WEST);
                break;
            case SOUTH:
                setDirection(Direction.EAST);
                break;
            case EAST:
                setDirection(Direction.NORTH);
                break;
            case WEST:
                setDirection(Direction.SOUTH);
                break;
        }
    }

    public void turnRight() {
        switch (location.getDirection()) {
            case NORTH:
                setDirection(Direction.EAST);
                break;
            case SOUTH:
                setDirection(Direction.WEST);
                break;
            case EAST:
                setDirection(Direction.SOUTH);
                break;
            case WEST:
                setDirection(Direction.NORTH);
                break;
        }
    }
    public void setDirection(Direction direction){
        location.setDirection(direction);
    }

}
