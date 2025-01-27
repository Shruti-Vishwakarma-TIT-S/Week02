package com.encapsulation.ecommerceplatform;

public class Main {
    public static void main(String[] args) {
        // Create instances of products
        Electronics laptop = new Electronics(1, "Laptop", 1000, 0.10);
        Clothing tShirt = new Clothing(2, "T-Shirt", 20, 0.15);
        Groceries apple = new Groceries(3, "Apple", 1, 0.05);

        // Print final prices for each product
        System.out.println("Final Prices for Products: ");

        //print details
        printProductDetails(laptop);
        printProductDetails(tShirt);
        printProductDetails(apple);
    }

    // Method to print product details and final price
    private static void printProductDetails(Product product) {
        double discount = product.calculateDiscount();
        double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        if (product instanceof Taxable) {
            System.out.println(((Taxable) product).getTaxDetails());
            System.out.println("Tax: " + tax);
        }
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println();

    }
}