package com.inheritancequestions.hybrid.vehiclemanagement;

public class Vehicle {
    private int maxSpeed;
    private String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String displayInfo() {
        return "Model: " + model + ", Max Speed: " + maxSpeed + " km/h";
    }
}