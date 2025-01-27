
import java.util.Scanner;
//create a class EmployeeDetail
   class EmployeeDetail {
   //declare private instance variables
   private String name;
   private int id;
   private double salary;
   //create getter and setter methods to set and fetch values of instances
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public int getId() {
       return id;
   }
   public void setId(int id) {
       this.id = id;
   }
   public double getSalary() {
       return salary;
   }
   public void setSalary(double salary) {
       this.salary = salary;
   }
   //Here is the display method to print details of Main class
   public void display(){
       //use getter method to retrieve details of Employee
       System.out.println("Name: "+ getName());
       System.out.println(("ID: "+ getId()));
       System.out.println("Salary: "+ getSalary());
   }

}


//Main class
public class EmployeeMain {
   //main method
   public static void main(String[] args) {
       //Scanner object
       Scanner sc = new Scanner(System.in);
       //create object of class
       EmployeeDetail emp1 = new EmployeeDetail();
       //Enter details of attributes of class
       System.out.println("Enter name, id and salary: ");
       String name = sc.nextLine();
       int id =  sc.nextInt();
       double salary = sc.nextDouble();
       //use setter methods to set values
       emp1.setName(name);
       emp1.setId(id);
       emp1.setSalary(salary);
       emp1.display();
   }
}

