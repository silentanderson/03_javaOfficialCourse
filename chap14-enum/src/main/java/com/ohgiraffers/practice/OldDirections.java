package com.ohgiraffers.practice;

public class OldDirections {
    public static final int NORTH = 1;
    public static final int SOUTH = 2;
    public static final int EAST = 3;
    public static final int WEST = 4;

    public void move(int direction) {
        if (direction == NORTH) {
            System.out.println("Moving North");
        }
    }
}

// A method that expects a direction

