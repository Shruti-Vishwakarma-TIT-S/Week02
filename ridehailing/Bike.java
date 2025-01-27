package com.encapsulation.ridehailing;

// Class representing a Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown"; // Initial location
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Fare calculation for bike
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}