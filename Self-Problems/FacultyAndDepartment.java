
import java.util.ArrayList;

// Faculty class representing a faculty member
class Faculty {
    private String name; // Name of the faculty member

    // Constructor to initialize the Faculty object
    public Faculty(String name) {
        this.name = name;
    }

    // Method to get the faculty member's name
    public String getName() {
        return name;
    }
}

// Department class representing a department in the university
class Department {
    String departmentName; // Name of the department
    ArrayList<Faculty> facultyMembers; // List of faculty members in the department

    // Constructor to initialize the Department object
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>(); // Initialize the ArrayList for faculty members
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty); // Add the faculty member to the list
        System.out.println(faculty.getName() + " has been added to the " + departmentName + " department.");
    }

    // Method to display all faculty members in the department
    public void displayFaculty() {
        System.out.println("Faculty members in " + departmentName + " department:");
        for (Faculty faculty : facultyMembers) {
            System.out.println("- " + faculty.getName()); // Print each faculty member's name
        }
    }
}

// University class representing a university with departments
class University {
    private String universityName; // Name of the university
    private ArrayList<Department> departments; // List of departments in the university

    // Constructor to initialize the University object
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>(); // Initialize the ArrayList for departments
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department); // Add the department to the list
        System.out.println("Department " + department.departmentName + " has been added to " + universityName);
    }

    // Method to display all departments in the university
    public void displayDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.departmentName); // Print each department's name
            department.displayFaculty(); // Display faculty members in the department
        }
    }

    // Method to delete the university (clears all departments)
    public void deleteUniversity() {
        departments.clear(); // Clear all departments
        System.out.println("All departments have been deleted from " + universityName);
    }
}

// Main class to demonstrate the composition and aggregation relationship
public class FacultyAndDepartment {
    public static void main(String[] args) {
        // Create a University object
        University university = new University("Tech University");

        // Create Department objects
        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        // Add departments to the university
        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);

        // Create Faculty objects
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");
        Faculty faculty3 = new Faculty("Dr. Charlie");

        // Add faculty members to departments
        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);
        eeDepartment.addFaculty(faculty3);

        // Display all departments and their faculty members
        university.displayDepartments();

        // Delete the university (this will also delete all departments)
        university.deleteUniversity();

        // Attempt to display departments after deletion
        university.displayDepartments(); // This will show no departments or faculty members left
    }
}

