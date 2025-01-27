
// Base class Employee
class Employee {
   // Instance variables
   public String employeeID;  // public access modifier
   protected String department;  // protected access modifier
   private double salary;  // private access modifier

   // Constructor to initialize employee details
   public Employee(String employeeID, String department, double salary) {
       this.employeeID = employeeID;
       this.department = department;
       this.salary = salary;
   }

   // Public method to modify the salary
   public void setSalary(double salary) {
       this.salary = salary;
   }

   // Public method to get the salary
   public double getSalary() {
       return salary;
   }

   // Method to display employee details
   public void displayEmployeeDetails() {
       System.out.println("Employee ID: " + employeeID);
       System.out.println("Department: " + department);
       System.out.println("Salary: Rs" + salary);
   }
}

// Subclass Manager that extends Employee
class Manager extends Employee {
   // Constructor to initialize Manager object
   public Manager(String employeeID, String department, double salary) {
       super(employeeID, department, salary);  // Call parent constructor
   }

   // Method to display manager details, demonstrating access to employeeID and department
   public void displayManagerDetails() {
       System.out.println("Manager Details:");
       System.out.println("Employee ID: " + employeeID);  // Accessing public member directly
       System.out.println("Department: " + department);  // Accessing protected member from subclass
       System.out.println("Salary: Rs" + getSalary());  // Accessing private member through public method
   }
}

// Main class to test the functionality
public class EmployeeRecords {
   public static void main(String[] args) {
       // Create an employee object
       Employee employee1 = new Employee("E001", "HR", 50000.0);
       employee1.displayEmployeeDetails();

       // Modify salary using public method
       employee1.setSalary(55000.0);
       System.out.println("Updated Salary: Rs" + employee1.getSalary());

       // Create a manager object
       Manager manager1 = new Manager("M001", "IT", 80000.0);
       manager1.displayManagerDetails();
   }
}

