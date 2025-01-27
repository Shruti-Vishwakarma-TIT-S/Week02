package com.encapsulation.ridehailing;

public class Main{
    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle car = new Car("C001", "Alice", 10.0); // Rate per Km for car
        Vehicle bike = new Bike("B001", "Bob", 5.0); // Rate per Km for bike
        Vehicle auto = new Auto("A001", "Charlie", 7.0); // Rate per Km for auto

        // Update locations
        ((GPS) car).updateLocation("Downtown");
        ((GPS) bike).updateLocation("Uptown");
        ((GPS) auto).updateLocation("Midtown");

        // Calculate fares for different distances
        double distance = 15.0; // Example distance in Km
        calculateFare(car, distance);
        calculateFare(bike, distance);
        calculateFare(auto, distance);
    }

    // Method to calculate and display fare
    private static void calculateFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        double fare = vehicle.calculateFare(distance);
        System.out.println("Distance: " + distance + " Km, Total Fare: " + fare);
        if (vehicle instanceof GPS) {
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
        }
        System.out.println("-----------------------------");
    }
}