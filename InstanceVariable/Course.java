// Default class for Course
class CourseDetails {
   // Instance Variables (unique for each course)
   private String courseName;
   private int duration;  // Duration in days
   private double fee;

   // Class Variable (common for all courses)
   static String instituteName = "Default Institute";

   // Constructor to initialize course details
   public CourseDetails(String courseName, int duration, double fee) {
       this.courseName = courseName;
       this.duration = duration;
       this.fee = fee;
   }

   // Instance Method to display the details of a course
   public void displayCourseDetails() {
       System.out.println("Course Name: " + courseName);
       System.out.println("Duration: " + duration + " days");
       System.out.println("Fee: $" + fee);
       System.out.println("Institute: " + instituteName);
   }

   // Class Method to update the institute name for all courses
   public static void updateInstituteName(String newInstituteName) {
       instituteName = newInstituteName;  // Modify the class variable
   }
}

// Public class
public class Course {
   public static void main(String[] args) {
       // Create some courses
       CourseDetails course1 = new CourseDetails("Java Programming", 30, 200.50);
       CourseDetails course2 = new CourseDetails("Web Development", 45, 300.75);

       // Display course details before updating the institute name
       System.out.println("Before updating institute name:");
       course1.displayCourseDetails();
       course2.displayCourseDetails();

       // Update the institute name using the class method
       CourseDetails.updateInstituteName("Advanced Learning Institute");

       // Display course details after updating the institute name
       System.out.println("\nAfter updating institute name:");
       course1.displayCourseDetails();
       course2.displayCourseDetails();
   }
}