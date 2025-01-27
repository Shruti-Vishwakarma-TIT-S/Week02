package com.inheritancequestions.hybrid.vehiclemanagement;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(getModel() + " is charging.");
    }
}