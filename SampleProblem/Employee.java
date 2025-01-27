public class Employee {
    private String name;
    // Name of the employee
    private final int id;
    // ID of the employee (constant)
    private String designation;
    // Designation of the employee
    static String companyName;
    // Shared company name for all employees
    static int count;
    // Count of employees created
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        count++;
        // Increment employee count
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees are " + count);
        // Display total number of employees
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        // Display employee details
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        String name = "Dhvani";
        int id = 101;
        String designation = "Engineer";
        Employee.companyName = "Abc group";
        // Set company name for all employees
        Employee e = new Employee(name, id, designation);
        // Create an Employee object
        if(e instanceof Employee) {
            System.out.println("Yes e is instance of Employee");
            e.displayDetails();
            // Display employee details
            Employee.displayTotalEmployees();
            // Display total number of employees
        } else {
            System.out.println("No e is not the instance of Employee");
        }
    }
}
