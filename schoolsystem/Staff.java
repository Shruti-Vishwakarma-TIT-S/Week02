package com.inheritancequestions.hierarchical.schoolsystem;

public class Staff extends Person {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public String displayRole() {
        return displayInfo() + ", Role: Staff, Position: " + position;
    }
}
