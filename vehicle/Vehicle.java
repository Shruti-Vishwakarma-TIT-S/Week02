package com.inheritancequestions.assisted.vehicle;

public class Vehicle {
    double maxSpeed ;
    String fuelType;
    Vehicle(double maxSpeed ,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(){
        System.out.println("Max Speed "+ maxSpeed+ "\nFuel Type "+ fuelType);
    }
}
