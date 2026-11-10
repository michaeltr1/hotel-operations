package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // 1. Test the Room class
        // Parameters: numberOfBeds, price, isOccupied, isDirty
        Room room1 = new Room(2, 124.00, false, false);

        System.out.println("--- Room Details ---");
        System.out.println("Number of Beds: " + room1.getNumberOfBeds());
        System.out.println("Price: $" + room1.getPrice());
        System.out.println("Is Occupied: " + room1.isOccupied());
        System.out.println("Is Dirty: " + room1.isDirty());
        System.out.println("Is Available: " + room1.isAvailable()); // Should be true since it's not occupied and not dirty

        System.out.println();

        // Test the Reservations class
        Reservations res1 = new Reservations("king", 3, true);

        System.out.println("--- Reservation Details ---");
        System.out.println("Room Type: " + res1.getRoomType());
        System.out.println("Number of Nights: " + res1.getNumberOfNights());
        System.out.println("Is Weekend: " + res1.isWeekend());
        System.out.println("Calculated Nightly Rate (King + Weekend Surcharge): $" + res1.getPrice());
        System.out.println("Total Cost for Stay: $" + res1.getReservationTotal());
    }
}