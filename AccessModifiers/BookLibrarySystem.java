// Base class Book
class Book1 {
   // Instance variables
   public String ISBN; // public access modifier
   protected String title; // protected access modifier
   private String author; // private access modifier

   // Constructor to initialize Book object
   public Book1(String ISBN, String title, String author) {
       this.ISBN = ISBN;
       this.title = title;
       this.author = author;
   }

   // Public method to access and modify the author name
   public String getAuthor() {
       return author;
   }

   public void setAuthor(String author) {
       this.author = author;
   }

   // Method to display book details
   public void displayBookDetails() {
       System.out.println("ISBN: " + ISBN);
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);
   }
}

// Subclass EBook that extends Book
class EBook extends Book1 {
   // Constructor to initialize EBook object
   public EBook(String ISBN, String title, String author) {
       super(ISBN, title, author);  // Call parent constructor
   }

   // Method to display ebook details, demonstrating access to ISBN and title
   public void displayEBookDetails() {
       System.out.println("EBook Details:");
       System.out.println("ISBN: " + ISBN);  // Accessing public member directly
       System.out.println("Title: " + title);  // Accessing protected member from subclass
       System.out.println("Author: " + getAuthor());  // Accessing private member through public method
   }
}

// Main class to test the functionality
public class BookLibrarySystem {
   public static void main(String[] args) {
       // Create a book object
       Book1 book1 = new Book1("978-3-16-1484", "Java Programming", "James Gosling");
       book1.displayBookDetails();

       // Modify author name using public method
       book1.setAuthor("John Doe");
       System.out.println("Updated Author: " + book1.getAuthor());

       // Create an ebook object
       EBook eBook1 = new EBook("978-1-4028-946", "Python Programming", "Guido van Rossum");
       eBook1.displayEBookDetails();
   }
}