
import java.util.Scanner;
// This class represents a Circle
class Circle {
    // Declare a private instance variable to store the radius of the circle
    private double radius;

    // Default constructor that sets the radius to 5.6 and prints a message
    public Circle() {
        this(5.6);  // Call the second constructor with a radius of 5.6
        System.out.println("Default radius was 5.6");
    }

    // Constructor that takes a radius value and sets it
    public Circle(double radius) {
        this.radius = radius;  // Set the radius to the given value
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);  // Formula for area: π * radius^2
    }

    // Method to calculate the perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;  // Formula for perimeter: 2 * π * radius
    }

    // Method to display the area and perimeter of the circle
    public void display() {
        System.out.println("Area of Circle would be " + calculateArea());  // Print area
        System.out.println("Perimeter of Circle " + calculatePerimeter());  // Print perimeter
    }
}
public class CircleMain {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create a Circle object using the default constructor
        Circle circle1 = new Circle();
        // Display the area and perimeter of the first circle
        circle1.display();

        // Prompt the user to enter the radius for the second circle
        System.out.println("Enter radius: \n");
        // Read the radius value entered by the user
        double radius = sc.nextDouble();

        // Create a Circle object using the constructor with the user-specified radius
        Circle circle2 = new Circle(radius);
        // Display the area and perimeter of the second circle
        circle2.display();
    }
}

