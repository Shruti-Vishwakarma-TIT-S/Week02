package com.inheritancequestions.hybrid.restaurantmanagement;

public class Test {
    public static void main(String[] args) {
        Chef chef = new Chef("Goldee", 1);
        Waiter waiter = new Waiter("Gaurav", 2);

        System.out.println(chef.displayInfo());
        chef.performDuties();

        System.out.println(waiter.displayInfo());
        waiter.performDuties();
    }
}