package com.encapsulation.ecommerceplatform;

// Class representing Groceries products
class Groceries extends Product {
    private double discountRate; // Discount rate for groceries

    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate; // Calculate discount
    }
}