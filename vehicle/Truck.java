package com.inheritancequestions.assisted.vehicle;

public class Truck extends Vehicle{
    int loadInTons ;
    Truck(double maxSpeed, String fuelType ){
        super(maxSpeed, fuelType);
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load in tons "+ loadInTons);
    }
}
