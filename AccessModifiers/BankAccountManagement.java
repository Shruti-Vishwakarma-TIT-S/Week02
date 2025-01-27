
// Base class BankAccount
class BankAccount {
   // Instance variables
   public String accountNumber;  // public access modifier
   protected String accountHolder;  // protected access modifier
   private double balance;  // private access modifier

   // Constructor to initialize bank account details
   public BankAccount(String accountNumber, String accountHolder, double balance) {
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder;
       this.balance = balance;
   }

   // Public method to access and modify the balance
   public double getBalance() {
       return balance;
   }

   public void setBalance(double balance) {
       this.balance = balance;
   }

   // Method to display bank account details
   public void displayAccountDetails() {
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Account Holder: " + accountHolder);
       System.out.println("Balance: Rs" + balance);
   }
}

// Subclass SavingsAccount that extends BankAccount
class SavingsAccount extends BankAccount {
   // Constructor to initialize SavingsAccount object
   public SavingsAccount(String accountNumber, String accountHolder, double balance) {
       super(accountNumber, accountHolder, balance);  // Call parent constructor
   }

   // Method to display savings account details, demonstrating access to accountNumber and accountHolder
   public void displaySavingsAccountDetails() {
       System.out.println("Savings Account Details:");
       System.out.println("Account Number: " + accountNumber);  // Accessing public member directly
       System.out.println("Account Holder: " + accountHolder);  // Accessing protected member from subclass
       System.out.println("Balance: Rs" + getBalance());  // Accessing private member through public method
   }
}

// Main class to test the functionality
public class BankAccountManagement {
   public static void main(String[] args) {
       // Create a bank account object
       BankAccount account1 = new BankAccount("12345", "Anjali", 1000.0);
       account1.displayAccountDetails();

       // Modify balance using public method
       account1.setBalance(1500.0);
       System.out.println("Updated Balance: Rs" + account1.getBalance());

       // Create a savings account object
       SavingsAccount savingsAccount = new SavingsAccount("67890", "Mohan", 2500.0);
       savingsAccount.displaySavingsAccountDetails();
   }
}

