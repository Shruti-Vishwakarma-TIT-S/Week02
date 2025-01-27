package com.inheritancequestions.hierarchical.schoolsystem;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String displayRole() {
        return displayInfo() + ", Role: Teacher, Subject: " + subject;
    }
}