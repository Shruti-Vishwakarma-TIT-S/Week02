
// Default class for Vehicle
class Vehicle {
   // Instance Variables (unique for each vehicle)
   private String ownerName;
   private String vehicleType;

   // Class Variable (fixed for all vehicles)
   static double registrationFee = 100.0;  // Default registration fee for all vehicles

   // Constructor to initialize vehicle details
   public Vehicle(String ownerName, String vehicleType) {
       this.ownerName = ownerName;
       this.vehicleType = vehicleType;
   }

   // Instance Method to display the details of the vehicle
   public void displayVehicleDetails() {
       System.out.println("Owner Name: " + ownerName);
       System.out.println("Vehicle Type: " + vehicleType);
       System.out.println("Registration Fee: $" + registrationFee);
   }

   // Class Method to update the registration fee for all vehicles
   public static void updateRegistrationFee(double newRegistrationFee) {
       registrationFee = newRegistrationFee;  // Modify the class variable
   }
}

// Public class
public class VehicleDetails {
   public static void main(String[] args) {
       // Create some vehicle objects
       Vehicle vehicle1 = new Vehicle("Alice", "Car");
       Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle");

       // Display vehicle details before updating the registration fee
       System.out.println("Before updating registration fee:");
       vehicle1.displayVehicleDetails();
       vehicle2.displayVehicleDetails();

       // Update the registration fee using the class method
       Vehicle.updateRegistrationFee(150.0);

       // Display vehicle details after updating the registration fee
       System.out.println("\nAfter updating registration fee:");
       vehicle1.displayVehicleDetails();
       vehicle2.displayVehicleDetails();
   }
}

