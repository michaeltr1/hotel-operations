package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price; // Changed to double and renamed from getPrice to price
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() { // Changed return type to double
        return price;
    }

    public void setPrice(double price) { // Fixed setter name to match price
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    // This correctly calculates availability based on whether it's clean and unoccupied
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}