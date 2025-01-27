package com.encapsulation.employeemanagement;

// Class representing a full-time employee
class FullTimeEmployee extends Employee {
    // Constructor to initialize full-time employee details
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Implementation of calculateSalary for full-time employees
    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary for full-time employees
    }
}