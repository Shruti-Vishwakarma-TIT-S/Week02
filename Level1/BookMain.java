
import java.util.Scanner;
// This class represents a Book
class Book {
    // These are the details of the book: title, author, and price
    private String title;
    private String author;
    private double price;

    // Default constructor that prints a message asking for book details
    Book(){
        System.out.println("Enter the details of the book as titleName, authorName, price ");
    }

    // Constructor that sets the title, author, and price of the book
    Book(String title, String author, double price){
        this.title = title;  // Set the book's title
        this.author = author;  // Set the book's author
        this.price = price;  // Set the book's price
    }

    // Method to display the book's details
    public void display(){
        System.out.println("The details are as follows : ");
        // Print the title, author, and price of the book
        System.out.println("Title: "+ title + "\nAuthor: "+ author + "\nPrice: "+ price);
    }
}
public class BookMain {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Create a Book object using the default constructor (it asks for input)
        Book book = new Book();

        // Read the book title, author, and price from the user
        String title = sc.nextLine();  // Read the book title
        String author = sc.nextLine();  // Read the author's name
        double price = sc.nextDouble();  // Read the book's price

        // Create a new Book object with the user input details
        Book bookMain = new Book(title, author, price);

        // Display the details of the book
        bookMain.display();
    }
}

