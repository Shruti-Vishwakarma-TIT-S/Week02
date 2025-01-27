// CartItem class with attributes and methods
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize cart item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods for itemName
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter and setter methods for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and setter methods for quantity
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Item added to cart.");
    }

    // Method to remove an item from the cart
    public void removeItem() {
        this.itemName = null;
        this.price = 0;
        this.quantity = 0;
        System.out.println("Item removed from cart.");
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Total cost of items in cart: $" + totalCost);
    }
}

// Main method inside a new class
public class ShoppingCart {
    public static void main(String[] args) {
        // Create a CartItem object
        CartItem item = new CartItem("Laptop", 999.99, 1);
        // Add an item to the cart
        item.addItem("Smartphone", 599.99, 2);
        // Display total cost
        item.displayTotalCost();
        // Remove an item from the cart
        item.removeItem();
    }
}
