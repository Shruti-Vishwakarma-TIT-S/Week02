import java.util.ArrayList;

// Course class representing a course in the school
class Course {
    private String courseName; // Name of the course
    private ArrayList<Student> enrolledStudents; // List of students enrolled in the course

    // Constructor to initialize the Course object
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>(); // Initialize the ArrayList for enrolled students
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student); // Add the student to the list
            student.addCourse(this); // Add this course to the student's list of courses
            System.out.println(student.getName() + " has been enrolled in " + courseName);
        } else {
            System.out.println(student.getName() + " is already enrolled in " + courseName);
        }
    }

    // Method to display all students enrolled in the course
    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName()); // Print each student's name
        }
    }

    // Getter method for course name
    public String getCourseName() {
        return courseName;
    }
}

// Student class representing a student in the school
class Student {
    private String name; // Name of the student
    private ArrayList<Course> courses; // List of courses the student is enrolled in

    // Constructor to initialize the Student object
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>(); // Initialize the ArrayList for courses
    }

    // Method to add a course to the student's list
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course); // Add the course to the list
        }
    }

    // Method to display all courses the student is enrolled in
    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName()); // Print each course's name
        }
    }

    // Getter method for student name
    public String getName() {
        return name;
    }
}

// School class representing a school with students
class School {
    private String schoolName; // Name of the school
    private ArrayList<Student> students; // List of students in the school

    // Constructor to initialize the School object
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>(); // Initialize the ArrayList for students
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student); // Add the student to the list
            System.out.println(student.getName() + " has been added to " + schoolName);
        } else {
            System.out.println(student.getName() + " is already enrolled in " + schoolName);
        }
    }

    // Method to display all students in the school
    public void displayStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName()); // Print each student's name
        }
    }
}

// Main class to demonstrate the association and aggregation relationship
public class SchoolAndStudent {
    public static void main(String[] args) {
        // Create a School object
        School school = new School("Greenwood High");

        // Create Student objects
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create Course objects
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student2);
        course2.enrollStudent(student3);
        course3.enrollStudent(student1);
        course3.enrollStudent(student3);

        // Display all students in the school
        school.displayStudents();
        // Display all courses for each student
        System.out.println("\nDisplaying courses for each student:");
        student1.displayCourses();
        student2.displayCourses();
        student3.displayCourses();

        // Display all students enrolled in each course
        System.out.println("\nDisplaying enrolled students for each course:");
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
        course3.displayEnrolledStudents();
    }
}