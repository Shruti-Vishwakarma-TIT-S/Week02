package com.encapsulation.ecommerceplatform;

// Class representing Clothing products
class Clothing extends Product implements Taxable {
    private double discountRate; // Discount rate for clothing

    public Clothing(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate; // Calculate discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10; // 10% tax for clothing
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: 10%";
    }
}