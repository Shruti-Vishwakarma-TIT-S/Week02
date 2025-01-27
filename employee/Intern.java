package com.inheritancequestions.assisted.employee;

public class Intern extends Employee {
    int training ;
    Intern(String name, int id, double salary){
        super(name, id, salary);
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Training Days "+ training);
    }
}
