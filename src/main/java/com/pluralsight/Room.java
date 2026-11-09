package com.pluralsight;

public class Room {
    int numberOfBeds;
    int getPrice;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getPrice() {
        return getPrice;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public boolean isDirty() {
        return isDirty;
    }
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}
