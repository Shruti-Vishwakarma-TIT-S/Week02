// This class is for car rental details
public class CarRental {
    // These are the details of the customer and car
    private String customerName;
    private String carModel;
    private int rentalDays;
    // Constructor to set up the car rental details
    CarRental(String customerName, String carModel, int rentalDays ){
        this.customerName = customerName;  // Set customer name
        this.carModel = carModel;          // Set car model
        this.rentalDays = rentalDays;      // Set how many days the car is rented
    }
    // Method to calculate and show the total cost
    void totalCost(double costPerDay){
        // Print customer details and how many days rented
        System.out.println("Customer Name: "+ customerName+ "\nCar Model: "+ carModel+ "\nRental Days: "+ rentalDays);
        // Show the total cost of rental
        System.out.println("Total cost would be : "+ rentalDays*costPerDay);
    }
}
// Main class to run the program
class CarRentalMain{
    public static void main(String[] args) {
        // Details of the rental
        String customerName = "Aastha";
        String carModel = "Maruti Suzuki";
        int rentalDays = 4;
        double costPerDay = 456.9;
        // Create a car rental object with the details
        CarRental car = new CarRental(customerName, carModel, rentalDays);
        // Call the method to calculate and show total cost
        car.totalCost(costPerDay);
    }
}