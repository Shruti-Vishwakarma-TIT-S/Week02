package com.inheritancequestions.hybrid.vehiclemanagement;

public class Test {
    public static void main(String[] args) {
        ElectricVehicle electricCar = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle petrolCar = new PetrolVehicle(120, "Toyota Corolla");

        System.out.println(electricCar.displayInfo());
        electricCar.charge();

        System.out.println(petrolCar.displayInfo());
        petrolCar.refuel();
    }
}
