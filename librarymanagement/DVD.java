package com.encapsulation.librarymanagement;

// Class representing a DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Initially available
    }

    @Override
    public int getLoanDuration() {
        return 3; // Loan duration for DVDs is 3 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved: " + getItemDetails());
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}