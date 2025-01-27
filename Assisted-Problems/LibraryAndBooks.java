import java.util.ArrayList;

// Book class representing a book with a title and an author
class Book {
    private String title; // Title of the book
    private String author; // Author of the book

    // Constructor to initialize the Book object
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter method for the title
    public String getTitle() {
        return title;
    }

    // Getter method for the author
    public String getAuthor() {
        return author;
    }

    // Method to display book information
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

// Library class that contains a list of Book objects
class Library {
    private ArrayList<Book> books; // List to store books in the library

    // Constructor to initialize the Library object
    public Library() {
        books = new ArrayList<>(); // Initialize the ArrayList
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book); // Add the book to the list
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book); // Print each book's information
        }
    }
}

// Main class to demonstrate the aggregation relationship
public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create some Book objects with Indian literature titles and authors
        Book book1 = new Book("Madhushala", "Harivansh Rai Bachchan");
        Book book2 = new Book("Godaan", "Munshi Premchand");
        Book book3 = new Book("Gaban", "Munshi Premchand");

        // Create Library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to the first library
        library1.addBook(book1);
        library1.addBook(book2);

        // Add a book to the second library
        library2.addBook(book3);

        // Display books in both libraries
        library1.displayBooks(); // Display books in library1
        library2.displayBooks(); // Display books in library2

        // Demonstrating that books can exist independently
        System.out.println("\nBooks can exist independently:");
        System.out.println(book1); // Display book1 information
        System.out.println(book2); // Display book2 information
        System.out.println(book3); // Display book3 information
    }
}

