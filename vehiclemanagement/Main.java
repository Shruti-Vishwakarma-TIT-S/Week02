package com.encapsulation.vehiclemanagement;

public class Main {
    public static void main(String[] args) {
        // Create instances of vehicles
        Car car = new Car("C123", 100, "INS12345");
        Bike bike = new Bike("B456", 50, "INS67890");
        Truck truck = new Truck("T789", 150, "INS11223");

        // Define rental days
        int rentalDays = 5; // Example rental period

        // Calculate and print rental and insurance costs for each vehicle
        printVehicleDetails(car, rentalDays);
        printVehicleDetails(bike, rentalDays);
        printVehicleDetails(truck, rentalDays);
    }

    // Method to print vehicle details and costs
    private static void printVehicleDetails(Vehicle vehicle, int days) {
        double rentalCost = vehicle.calculateRentalCost(days);
        double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0;

        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("Type: " + vehicle.getType());
        System.out.println("Rental Cost for " + days + " days: " + rentalCost);
        if (vehicle instanceof Insurable) {
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
            System.out.println("Insurance Cost: " + insuranceCost);
        }
        System.out.println("-----------------------------");
    }
}