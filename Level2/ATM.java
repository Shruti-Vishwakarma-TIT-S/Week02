
// BankAccount class with attributes and methods
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and setter methods for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter and setter methods for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and setter methods for balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main method inside a new class
public class ATM {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("Shruti", 123456, 5000.0);
        // Test deposit, withdraw, and display balance
        account.deposit(1500);
        account.withdraw(1000);
        account.displayBalance();
    }
}
