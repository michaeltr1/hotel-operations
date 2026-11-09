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

    public void setRoomType() {
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124;
        }
        if (isWeekend) {
            price = price * 1.1;

        }
    }


    public int numberOfNights(){
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
    public double reservationTotal(){
        return reservationTotal;
    }
}






