

//create a class Book
   class Book {
   //declare instance variables
   private String title;
   private String author;
   private double price;
   //use getter and setter methods to set and fetch values from class
   public String getTitle() {
       return title;
   }
   public void setTitle(String title) {
       this.title = title;
   }

   public String getAuthor() {
       return author;
   }

   public void setAuthor(String author) {
       this.author = author;
   }

   public double getPrice() {
       return price;
   }

   public void setPrice(double price) {
       this.price = price;
   }
   //display method to print details
   public void display(){
       System.out.println("Title "+ getTitle());
       System.out.println("Author "+ getAuthor());
       System.out.println("Price "+ getPrice());
   }
}
//create a class BookDetail
public class BookDetail{
   //main method
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //Object creation of Book class
       Book b = new Book();
       System.out.println("Enter title, author, price ");
       //Enter specified details
       String title = sc.nextLine();
       String author = sc.nextLine();
       double price = sc.nextDouble();
       //set the values of attributes
       b.setTitle(title);
       b.setAuthor(author);
       b.setPrice(price);
       //call the display method
       b.display();
   }
}

