import java.util.ArrayList;

// Product class representing a product
class Product {
    private String productName; // Name of the product
    private double price; // Price of the product

    // Constructor to initialize the Product object
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product information
    public String toString() {
        return productName + " - Price: Rs" + price;
    }
}

// Order class representing an order containing multiple products
class Order {
    private ArrayList<Product> products; // List of products in the order

    // Constructor to initialize the Order object
    public Order() {
        this.products = new ArrayList<>(); // Initialize the ArrayList for products
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product); // Add the product to the list
        System.out.println(product.getProductName() + " has been added to the order.");
    }

    // Method to display all products in the order
    public void displayOrder() {
        System.out.println("Products in the order:");
        for (Product product : products) {
            System.out.println("- " + product); // Print each product's information
        }
    }
}

// Main class to demonstrate the aggregation relationship
public class OrderAndProduct {
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Headphones", 199.99);

        // Create Order objects
        Order order1 = new Order();
        Order order2 = new Order();

        // Add products to the first order
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Add a product to the second order
        order2.addProduct(product3);

        // Display products in both orders
        order1.displayOrder(); // Display products in order1
        order2.displayOrder(); // Display products in order2
    }
}

