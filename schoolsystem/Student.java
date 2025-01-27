package com.inheritancequestions.hierarchical.schoolsystem;
public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String displayRole() {
        return displayInfo() + ", Role: Student, Grade: " + grade;
    }
}
