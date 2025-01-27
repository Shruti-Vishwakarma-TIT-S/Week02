
import java.util.ArrayList;

// Account class representing a bank account
class Account {
    private String accountNumber; // Unique account number
    private double balance; // Balance of the account

    // Constructor to initialize the Account object
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance is set to 0
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Increase balance by the deposit amount
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance; // Return the current balance
    }
}

// Customer class representing a bank customer
class Customer {
    private String name; // Name of the customer
    private ArrayList<Account> accounts; // List of accounts associated with the customer

    // Constructor to initialize the Customer object
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>(); // Initialize the ArrayList for accounts
    }

    // Method to open a new account
    public void openAccount(String accountNumber) {
        Account newAccount = new Account(accountNumber); // Create a new account
        accounts.add(newAccount); // Add the account to the customer's list
        System.out.println("Account opened for " + name + " with account number: " + accountNumber);
    }

    // Method to view the balance of all accounts
    public void viewBalances() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getBalance());
        }
    }

    // Method to deposit money into a specific account
    public void depositToAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (accountNumber.equals(accountNumber)) {
                account.deposit(amount); // Deposit money into the account
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

// Bank class representing a bank with customers
class Bank {
    private String name; // Name of the bank
    private ArrayList<Customer> customers; // List of customers associated with the bank

    // Constructor to initialize the Bank object
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>(); // Initialize the ArrayList for customers
    }

    // Method to add a customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer); // Add the customer to the bank's list
        System.out.println("Customer " + customer.name + " added to " + name);
    }
}

// Main class to demonstrate the association relationship
public class BankAccountHolder {
    public static void main(String[] args) {
        // Create a Bank object
        Bank bank = new Bank("ABC Bank");

        // Create Customer objects
        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Smith");

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Open accounts for customers
        customer1.openAccount("ACC123");
        customer2.openAccount("ACC456");

        // Deposit money into accounts
        customer1.depositToAccount("ACC123", 500.0);
        customer2.depositToAccount("ACC456", 1000.0);

        // View balances for customers
        customer1.viewBalances();
        customer2.viewBalances();
    }
}

