// PalindromeChecker class with attributes and methods
class PalindromeChecker {
    private String text;

    // Constructor to initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Getter and setter methods for text
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }
}

// Main method inside a new class
public class PalindromeTest {
    public static void main(String[] args) {
        // Create a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker("Racecar");
        // Display result
        checker.displayResult();
    }
}
