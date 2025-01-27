package com.inheritancequestions.assisted.employee;

public class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary){
        super(name, id, salary);
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size "+ teamSize);
    }
}
