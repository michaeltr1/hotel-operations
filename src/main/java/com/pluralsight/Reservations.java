package com.pluralsight;

public class Reservations {
    String roomType;
    double price;
    int numberOfNights;
    boolean isWeekend;
    double reservationTotal;

    public Reservations(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    // Added (String roomType) parameter so it actually updates the field
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124;
        }
        if (isWeekend) {
            // Removed the stray '-' and added the '*' multiplication operator
            price = price * 1.10;
        }
        // Moved return price; outside of the if block so it always returns a value
        return price;
    }

    public int getNumberOfNights(){
        return numberOfNights;
    }

    // Changed return type from int to void (standard for setters)
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend){
        isWeekend = weekend;
    }

    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }
}