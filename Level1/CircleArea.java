

import java.util.Scanner;
//create a class CircleArea
public class CircleArea {
   //declare private instance variables
   private double radius;
   //constructor
   public CircleArea(double radius){
       this.radius = radius;
   }
   //method to calculate area
   public static double calculateArea(double radius){
       double area = Math.PI * Math.pow(radius, 2);
       return area;
   }
   //method to calculate perimeter
   public static double calculatePerimeter(double radius){
       double circumference = 2 * Math.PI * radius;
       return circumference;
   }
   //method to display details about area and perimeter
   public static void displayArea(double area, double circumference){
       System.out.println("Area of Circle would be "+ area);
       System.out.println("Perimeter of Circle "+ circumference);
   }
   //main method
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      //class object to invoke class constructor
       System.out.println("Enter radius of Circle: ");
       double radius = sc.nextDouble();
       CircleArea c = new CircleArea(radius);
       double a =  calculateArea(radius);
       double b =  calculatePerimeter(radius);
       //call display method
       displayArea(a, b);
   }
}

