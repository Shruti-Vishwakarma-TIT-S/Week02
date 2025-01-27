// This class is for a library book with its details
public class Library {
    // These are the details of the book
    private String title;
    private String author;
    private double price;
    private boolean availability = false;  // Set default availability as false
    // Constructor to set up the book details
    Library(String title, String author, double price, boolean availability){
        this.title = title;  // Set book title
        this.author = author;  // Set author name
        this.price = price;  // Set book price
        this.availability = availability;  // Set availability status
    }
    // Method to borrow the book and check its availability
    String borrow(){
        if(availability == true) {
            // If book is available, print book details
            System.out.println("Title " + title + "\nAuthor " + author + "\nPrice " + price);
            return "The book is present";  // Return that the book is available
        }
        else
            return "The book is not available";  // Return if the book is not available
    }
}
// Main class to run the program
class LibraryMain{
    public static void main(String[] args) {
        // Details of the book
        String title = "Story of My Life";
        String author = "Helen Keller";
        double price = 500.63;
        // Create a Library object with the book details
        Library lib = new Library(title, author, price, true);
        // Call the borrow method and print the result
        System.out.println(lib.borrow());
    }
}
