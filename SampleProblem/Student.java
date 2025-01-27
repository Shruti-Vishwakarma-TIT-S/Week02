public class Student {
    private String name;
    // Name of the student
    private final int rollNo;
    // Roll number of the student (constant)
    private String grade;
    // Grade of the student
    static String universityName;
    // Shared university name for all students
    static int count;
    // Count of students created

    Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        count++;
        // Increment student count
    }

    static void displayTotalStudents() {
        System.out.println("Total students enrolled are " + count);
        // Display total number of students
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
        // Display student details
    }
}

class StudentMain {
    public static void main(String[] args) {
        String name = "Shristy Sharma";
        int rollNo = 106;
        String grade = "2nd";
        Student.universityName = "RGPV";
        // Set university name for all students

        Student s = new Student(name, rollNo, grade);
        // Create a Student object

        if(s instanceof Student) {
            System.out.println("Yes s is the instance of Student");
            s.displayDetails();
            // Display student details
            Student.displayTotalStudents();
            // Display total number of students
        } else {
            System.out.println("No s is not the instance of Student");
        }
    }
}
