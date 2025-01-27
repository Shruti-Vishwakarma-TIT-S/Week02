import java.util.ArrayList;

// Course class representing a course
class Course {
    private String courseName; // Name of the course
    private String courseCode; // Code of the course

    // Constructor to initialize the Course object
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Getter method for course name
    public String getCourseName() {
        return courseName;
    }

    // Getter method for course code
    public String getCourseCode() {
        return courseCode;
    }

    // Method to display course information
    public String toString() {
        return courseName + " (" + courseCode + ")";
    }
}

// Student class representing a student
class Student {
    private String name; // Name of the student
    private ArrayList<Course> courses; // List of courses the student is enrolled in

    // Constructor to initialize the Student object
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>(); // Initialize the ArrayList for courses
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course); // Add the course to the list
        System.out.println(name + " has enrolled in " + course.getCourseName());
    }

    // Method to display all courses the student is enrolled in
    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course); // Print each course's information
        }
    }
}

// Main class to demonstrate the composition relationship
public class StudentAndCourse {
    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course("Mathematics", "MATH101");
        Course course2 = new Course("Science", "SCI101");
        Course course3 = new Course("History", "HIST101");

        // Create a Student object
        Student student = new Student("Shruti");

        // Enroll the student in courses
        student.enrollCourse(course1);
        student.enrollCourse(course2);
        student.enrollCourse(course3);

        // Display all courses for the student
        student.displayCourses();
    }
}


