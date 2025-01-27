
// Product class to manage product details and inventory
class ProductDetails {
   // Instance Variables (unique for each object)
   private String productName;
   private double price;

   // Class Variable (shared among all objects)
   static int totalProducts = 0;

   // Constructor to initialize product details
   public ProductDetails(String productName, double price) {
       this.productName = productName;
       this.price = price;
       totalProducts++;  // Increment totalProducts whenever a new product is created
   }

   // Instance Method to display details of a product
   public void displayProductDetails() {
       System.out.println("Product Name: " + productName);
       System.out.println("Price: " + price);
   }

   // Class Method to display the total number of products created
   public static void displayTotalProducts() {
       System.out.println("Total Products Created: " + totalProducts);
   }
}

// Main class to test Product class
public class Product {
   public static void main(String[] args) {
       // Create some products
       ProductDetails product1 = new ProductDetails("Laptop", 1500.00);
       ProductDetails product2 = new ProductDetails("Smartphone", 800.00);
       ProductDetails product3 = new ProductDetails("Tablet", 400.00);

       // Display individual product details
       product1.displayProductDetails();
       product2.displayProductDetails();
       product3.displayProductDetails();

       // Display the total number of products created
       ProductDetails.displayTotalProducts();
   }
}



