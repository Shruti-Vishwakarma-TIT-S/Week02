// MovieTicket class with attributes and methods
class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize ticket details
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.price = 10.0; // Default price
    }

    // Getter and setter methods for movieName
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    // Getter and setter methods for seatNumber
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Getter and setter methods for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: $" + price);
    }
}

// Main method inside a new class
public class MovieTicketBooking {
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Megan");
        // Book the ticket
        ticket.bookTicket("A12", 15.0);
        // Display ticket details
        ticket.displayTicketDetails();
    }
}
