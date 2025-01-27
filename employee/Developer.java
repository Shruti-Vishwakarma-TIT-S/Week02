package com.inheritancequestions.assisted.employee;

public class Developer extends Employee{
    String programmingLanguage;
    Developer(String name, int id, double salary){
        super(name, id, salary);
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language "+ programmingLanguage);
    }
}
