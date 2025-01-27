// create a Student class
class Student {
    private String name;
    private int rollNumber;
    private int marks;
    // Constructor to initialize attributes
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    // Getter and setter methods for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Getter and setter methods for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    // Getter and setter methods for marks
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

// Main method inside a new class
public class StudentReport {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Shruti", 101, 85);
        // Display student details and grade
        student.displayDetails();
    }
}
