
// This class represents hotel booking details
 class Hotel {
    // These are the details of the guest, room type, and nights stayed
    private String guestName;
    private String roomType;
    private int nights;
    // Default constructor to set default values
    Hotel(){
        guestName = "Dhani";  // Set default guest name
        roomType = "Premium";  // Set default room type
        nights = 2;  // Set default number of nights
    }
    // Constructor to set custom guest details
    Hotel(String guestName, String roomType, int nights){
        this.guestName = guestName;  // Set guest name
        this.roomType = roomType;  // Set room type
        this.nights = nights;  // Set number of nights
    }
    // Copy constructor to copy another hotel object's details
    Hotel(Hotel h){
        this.guestName = h.guestName;  // Copy guest name
        this.roomType = h.roomType;  // Copy room type
        this.nights = h.nights;  // Copy number of nights
    }
    // Method to display the details of the booking
    void displayDetails(){
        System.out.println("GuestName: "+ guestName + "\nRoom type: "+ roomType+ "\nNights: "+ nights);
    }
}
// This class is for running the hotel booking program
public class HotelMain {
    public static void main(String[] args) {
        // Create a Hotel object using the default constructor
        Hotel hotel = new Hotel();
        // Create a Hotel object with custom guest details
        Hotel hotel1 = new Hotel("Shruti", "Deluxe", 3);
        // Create a Hotel object by copying the details from hotel1
        Hotel hotel2 = new Hotel(hotel1);

        // Display details of the first hotel object
        hotel.displayDetails();
        // Display details of the second hotel object
        hotel1.displayDetails();
        // Display details of the third hotel object (copy of hotel1)
        hotel2.displayDetails();
    }
}

