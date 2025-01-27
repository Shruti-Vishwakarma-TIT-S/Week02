package com.encapsulation.ecommerceplatform;

// Class representing Electronics products
class Electronics extends Product implements Taxable {
    private double discountRate; // Discount rate for electronics

    public Electronics(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate; // Calculate discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15; // 15% tax for electronics
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: 15%";
    }
}