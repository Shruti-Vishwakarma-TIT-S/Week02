package com.inheritancequestions.hybrid.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(getModel() + " is refueling with petrol.");
    }
}