import java.util.ArrayList;
// Employee class representing an employee
class Employee {
    private String name; // Name of the employee
    private String employeeId; // ID of the employee

    // Constructor to initialize the Employee object
    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getter method for employee name
    public String getName() {
        return name;
    }

    // Getter method for employee ID
    public String getEmployeeId() {
        return employeeId;
    }

    // Method to display employee information
    public String toString() {
        return name + " (ID: " + employeeId + ")";
    }
}

// Department class representing a department
class Department {
    private String departmentName; // Name of the department
    private ArrayList<Employee> employees; // List of employees in the department

    // Constructor to initialize the Department object
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>(); // Initialize the ArrayList for employees
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee); // Add the employee to the list
        System.out.println(employee.getName() + " has been added to the " + departmentName + " department.");
    }

    // Method to display all employees in the department
    public void displayEmployees() {
        System.out.println("Employees in " + departmentName + " department:");
        for (Employee employee : employees) {
            System.out.println("- " + employee); // Print each employee's information
        }
    }
}

// Main class to demonstrate the association relationship
public class EmployeeAndDepartment {
    public static void main(String[] args) {
        // Create Department objects
        Department hrDepartment = new Department("Human Resources");
        Department itDepartment = new Department("IT");

        // Create Employee objects with Indian names
        Employee employee1 = new Employee("Aarav", "E001");
        Employee employee2 = new Employee("Vivaan", "E002");
        Employee employee3 = new Employee("Aditya", "E003");

        // Add employees to departments
        hrDepartment.addEmployee(employee1);
        hrDepartment.addEmployee(employee2);
        itDepartment.addEmployee(employee3);

        // Display all employees in each department
        hrDepartment.displayEmployees(); // Display employees in HR department
        itDepartment.displayEmployees(); // Display employees in IT department
    }
}

