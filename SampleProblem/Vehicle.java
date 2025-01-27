public class Vehicle {
    private String ownerName;
    // Owner's name of the vehicle
    private String vehicleType;
    // Type of the vehicle (e.g., Four-wheeler)
    private final int registrationNumber;
    // Registration number of the vehicle (constant)
    static int registrationFee;
    // Static registration fee for all vehicles
    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    static void updateRegistrationFee() {
        registrationFee = 1022;
        // Update the registration fee
        System.out.println("Updated registration fee is " + registrationFee);
        // Display the updated registration fee
    }
    void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        // Display vehicle details
    }
}

class VehicleMain {
    public static void main(String[] args) {
        String ownerName = "Shubeksha";
        String vehicleType = "Four-wheeler";
        int registrationNumber = 123689;
        Vehicle.registrationFee = 1000;
        // Set initial registration fee for all vehicles
        Vehicle v = new Vehicle(ownerName, vehicleType, registrationNumber);
        // Create a Vehicle object
        if(v instanceof Vehicle) {
            System.out.println("V is an instance of Vehicle");
            v.displayDetails();
            // Display vehicle details
            Vehicle.updateRegistrationFee();
            // Update and display the registration fee
        } else {
            System.out.println("V is not an instance of Vehicle");
        }
    }
}
