package com.inheritancequestions.assisted.vehicle;

import com.inheritancequestions.assisted.animal.Cat;

public class Car extends Vehicle {
    int seatCapacity ;
    Car(double maxSpeed, String fueltype){
        super(maxSpeed, fueltype);
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity "+ seatCapacity);
    }


}
