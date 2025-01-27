package com.encapsulation.librarymanagement;

public class Main{
    public static void main(String[] args) {
        // Create instances of library items
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Display item details and loan durations
        displayItemDetails(book);
        displayItemDetails(magazine);
        displayItemDetails(dvd);

        // Reserve items
        ((Reservable) book).reserveItem();
        ((Reservable) magazine).reserveItem();
        ((Reservable) dvd).reserveItem();

        // Check availability after reservation
        System.out.println("Book available: " + ((Reservable) book).checkAvailability());
        System.out.println("Magazine available: " + ((Reservable) magazine).checkAvailability());
        System.out.println("DVD available: " + ((Reservable) dvd).checkAvailability());

        // Attempt to reserve again to see the availability check
        ((Reservable) book).reserveItem(); // Should indicate that the book is not available
        ((Reservable) magazine).reserveItem(); // Should indicate that the magazine is not available
        ((Reservable) dvd).reserveItem(); // Should indicate that the DVD is not available
    }

    // Method to display item details
    private static void displayItemDetails(LibraryItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        System.out.println("-----------------------------");
    }
}