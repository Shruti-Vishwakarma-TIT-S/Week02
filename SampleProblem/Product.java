public class Product {
    private String productName;
    // Name of the product
    private double price;
    // Price of the product
    private int quantity;
    // Quantity of the product
    final int productId = 00110;
    // Product ID (constant)
    static int discount;
    // Static discount for all products
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    static void updateDiscount() {
        discount = 12;
        // Update the discount to 12
        System.out.println("Updated discount is " + discount);
        // Display updated discount
    }
    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product ID: " + productId);
        // Display product details
    }
}

class ProductMain {
    public static void main(String[] args) {
        String productName = "Cheese sticks";
        double price = 45.3;
        int quantity = 3;
        Product.discount = 10;
        // Set initial discount for all products
        Product p = new Product(productName, price, quantity);
        // Create a Product object
        if(p instanceof Product) {
            System.out.println("Yes p is the instance of Product");
            p.displayDetails();
            // Display product details
            Product.updateDiscount();
            // Update and display the new discount
        } else {
            System.out.println("No p is not the instance of Product");
        }
    }
}
