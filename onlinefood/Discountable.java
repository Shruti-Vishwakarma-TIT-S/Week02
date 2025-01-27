package com.encapsulation.onlinefood;

// Interface representing Discountable items
interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}