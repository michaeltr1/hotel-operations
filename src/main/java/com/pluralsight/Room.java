package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price; // Changed to double and renamed from getPrice to price
    private boolean isOccupied;
    private boolean isDirty;

    //methods for variables
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }
    //checkIn method for testing
    public boolean checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
            return true;
        }
        return false;
    }
    public void checkOut(){
        isOccupied = false;
    }
    public int getNumberOfBeds() {

        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {

        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

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

    // This calculates availability based on whether it's clean and unoccupied
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}