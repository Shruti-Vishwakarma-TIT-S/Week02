// Base class Student
class University {
   // Instance variables
   public int rollNumber; // public access modifier
   protected String name; // protected access modifier
   private double CGPA; // private access modifier

   // Constructor to initialize the Student object
   public University(int rollNumber, String name, double CGPA) {
       this.rollNumber = rollNumber;
       this.name = name;
       this.CGPA = CGPA;
   }

   // Public method to access and modify CGPA
   public double getCGPA() {
       return CGPA;
   }

   public void setCGPA(double CGPA) {
       this.CGPA = CGPA;
   }

   // Method to display student details
   public void displayDetails() {
       System.out.println("Roll Number: " + rollNumber);
       System.out.println("Name: " + name);
       System.out.println("CGPA: " + CGPA);
   }
}

// Subclass PostgraduateStudent that extends Student
class PostgraduateStudent extends University {
   // Constructor to initialize PostgraduateStudent object
   public PostgraduateStudent(int rollNumber, String name, double CGPA) {
       super(rollNumber, name, CGPA);  // Call parent constructor
   }

   // Method to display postgraduate student details, demonstrating access to protected member 'name'
   public void displayPostgraduateDetails() {
       System.out.println("Postgraduate Student Details:");
       System.out.println("Roll Number: " + rollNumber);  // Accessing public member directly
       System.out.println("Name: " + name);  // Accessing protected member from subclass
       System.out.println("CGPA: " + getCGPA());  // Accessing private member through public method
   }
}

// Main class to test the functionality
public class Student {
   public static void main(String[] args) {
       // Create a student object
       University student1 = new University(1, "Suhana Verma", 8.5);
       student1.displayDetails();

       // Modify CGPA using public method
       student1.setCGPA(9.0);
       System.out.println("Updated CGPA: " + student1.getCGPA());

       // Create a postgraduate student object
       PostgraduateStudent pgStudent = new PostgraduateStudent(2, "Jessica Mary", 8.7);
       pgStudent.displayPostgraduateDetails();
   }
}