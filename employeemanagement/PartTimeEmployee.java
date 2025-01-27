package com.encapsulation.employeemanagement;

// Class representing a part-time employee
class PartTimeEmployee extends Employee {
    // Additional field for part-time employees
    private int hoursWorked;

    // Constructor to initialize part-time employee details
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary for part-time employees
    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked; // Salary based on hours worked
    }

    // Getter and Setter for hoursWorked
    public int getHoursWorked() {
        return hoursWorked;
    }

    //setHoursWorked method
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}