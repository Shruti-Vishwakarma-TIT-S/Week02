package com.encapsulation.employeemanagement;

// Main class
public class Main {
    public static void main(String[] args) {
        // Fixed values for a single employee
        int employeeId = 1;
        String name = "Rohit";
        double baseSalary = 50000;
        int employeeType = 1;
        int hoursWorked = 25;

        Employee employee = new PartTimeEmployee(employeeId, name, baseSalary, hoursWorked);
        employee.assignDepartment("Information Technology");


        // Display employee details and calculated salary
        System.out.println("\nEmployee Details:\n");
        employee.displayDetails();
        System.out.println("Calculated Salary: " + employee.calculateSalary());
    }
}
