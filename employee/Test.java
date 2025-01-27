package com.inheritancequestions.assisted.employee;

public class Test {
    public static void main(String[] args) {
        Manager man = new Manager("Shruti", 108, 700000);
        man.teamSize = 15;
        man.displayDetails();
        Developer dev = new Developer("Dhani", 110, 96000);
        dev.programmingLanguage = "C++";
        dev.displayDetails();
        Intern intern = new Intern("Raj", 86, 86000);
        intern.training = 56;
        intern.displayDetails();
    }
}
