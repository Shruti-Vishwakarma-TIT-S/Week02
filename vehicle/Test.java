package com.inheritancequestions.assisted.vehicle;

public class Test {
    public static void main(String[] args) {
        Car c = new Car(56.99, "CNG");
        c.seatCapacity = 4;
        c.displayInfo();
        Truck t = new Truck(96.60, "Diesel");
        t.loadInTons = 1000;
        t.displayInfo();
        Motorcycle motor = new Motorcycle(60.45, "Petrol");
        motor.brand = "Hero Honda";
        motor.displayInfo();
    }
}
