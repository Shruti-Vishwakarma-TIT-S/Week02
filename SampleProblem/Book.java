public class Book {
    private String productName;
    // Title of the book
    private String author;
    // Author of the book
    private final long isbn;
    // ISBN number (constant)
    static String libraryName;
    // Shared library name for all books
    static int count;
    // Count of books created
    Book(String productName, String author, long isbn) {
        this.productName = productName;
        this.author = author;
        this.isbn = isbn;
    }
    static void displayLibraryName() {
        System.out.println("Library Name is " + libraryName);
        // Display the library name
    }
    void displayDetails() {
        System.out.println("Book Title: " + productName);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        // Display book details
    }
}

class BookMain {
    public static void main(String[] args) {
        String productName = "The story of My Life";
        String author = "Helen Keller";
        long isbn = 9788129137548l;
        Book.libraryName = "The Central Library";
        // Set library name for all books
        Book b = new Book(productName, author, isbn);
        // Create a Book object
        if(b instanceof Book) {
            System.out.println("Yes b is the instance of Book");
            b.displayDetails();
            // Display book details
            Book.displayLibraryName();
            // Display the library name
        } else {
            System.out.println("No b is not the instance of Book");
        }
    }
}
