package com.encapsulation.onlinefood;
public class Main{
    public static void main(String[] args) {
        // Create instances of food items
        FoodItem vegPizza = new VegItem("Veg Pizza", 8.99, 2);
        FoodItem chickenBurger = new NonVegItem("Chicken Burger", 5.99, 3, 1.50);

        // Apply discount to non-veg item
        ((NonVegItem) chickenBurger).applyDiscount(10);

        // Process order
        processOrder(vegPizza);
        processOrder(chickenBurger);
    }

    // Method to process the order
    private static void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());
        double totalPrice = item.calculateTotalPrice();
        System.out.println("Total Price: " + totalPrice);
        if (item instanceof Discountable) {
            System.out.println(((Discountable) item).getDiscountDetails());
        }
        System.out.println("-----------------------------");
    }
}