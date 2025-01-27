package com.encapsulation.onlinefood;

// Class representing a Non-Vegetarian Food Item
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge; // Additional charge for non-veg items
    private double discountPercentage;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discountPercentage = 0; // No discount initially
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = (getPrice() + additionalCharge) * getQuantity();
        return totalPrice - (totalPrice * discountPercentage / 100); // Apply discount if any
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discountPercentage + "%";
    }
}