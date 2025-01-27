
import java.util.ArrayList;

// Employee class representing an employee in a department
class Employee {
    private String name; // Name of the employee

    // Constructor to initialize the Employee object
    public Employee(String name) {
        this.name = name;
    }

    // Method to get the employee's name
    public String getName() {
        return name;
    }
}

// Department class representing a department in a company
class Department {
    private String departmentName; // Name of the department
    private ArrayList<Employee> employees; // List of employees in the department

    // Constructor to initialize the Department object
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>(); // Initialize the ArrayList for employees
    }

    // Method to add an employee to the department
    public void addEmployee(String employeeName) {
        Employee newEmployee = new Employee(employeeName); // Create a new employee
        employees.add(newEmployee); // Add the employee to the list
        System.out.println("Employee " + employeeName + " added to " + departmentName);
    }

    // Method to display all employees in the department
    public void displayEmployees() {
        System.out.println("Employees in " + departmentName + ":");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getName()); // Print each employee's name
        }
    }
}

// Company class representing a company with departments
class Company {
    private String companyName; // Name of the company
    private ArrayList<Department> departments; // List of departments in the company

    // Constructor to initialize the Company object
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>(); // Initialize the ArrayList for departments
    }

    // Method to add a department to the company
    public void addDepartment(String departmentName) {
        Department newDepartment = new Department(departmentName); // Create a new department
        departments.add(newDepartment); // Add the department to the list
        System.out.println("Department " + departmentName + " added to " + companyName);
    }

    // Method to display all departments and their employees
    public void displayDepartments() {
        System.out.println("Departments in " + companyName + ":");
        for (Department department : departments) {
            department.displayEmployees(); // Display employees in each department
        }
    }

    // Method to delete the company (clears all departments and employees)
    public void deleteCompany() {
        departments.clear(); // Clear all departments
        System.out.println("All departments and employees deleted from " + companyName);
    }
}

// Main class to demonstrate the composition relationship
public class CompanyAndDepartment {
    public static void main(String[] args) {
        // Create a Company object
        Company company = new Company("Tech Solutions");

        // Add departments to the company
        company.addDepartment("Development");
        company.addDepartment("Marketing");

        // Add employees to the departments
        company.departments.get(0).addEmployee("Alice");
        company.departments.get(0).addEmployee("Bob");
        company.departments.get(1).addEmployee("Charlie");

        // Display all departments and their employees
        company.displayDepartments();

        // Delete the company (this will also delete all departments and employees)
        company.deleteCompany();

        // Attempt to display departments after deletion
        company.displayDepartments(); // This will show no departments or employees
    }
}

