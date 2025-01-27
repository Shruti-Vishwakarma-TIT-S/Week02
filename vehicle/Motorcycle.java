package com.inheritancequestions.assisted.vehicle;

import com.inheritancequestions.assisted.employee.Manager;

public class Motorcycle extends Vehicle{
    String brand;
    Motorcycle(double maxSpeed, String fuelType){
        super(maxSpeed, fuelType);
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Brand Name "+ brand);
    }
}
