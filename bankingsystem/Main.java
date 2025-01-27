package com.encapsulation.bankingsystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of bank accounts
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "Alice", 2000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount("CA456", "Bob", 800, 200);

        // Demonstrate deposit and withdrawal
        savingsAccount.deposit(500);
        savingsAccount.withdraw(300);
        currentAccount.deposit(1000);
        currentAccount.withdraw(2000); // Should allow due to overdraft

        // Calculate and display interest for each account
        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Current Account Interest: " + currentAccount.calculateInterest());

        // Demonstrate loan application and eligibility
        savingsAccount.applyForLoan(1500);
        System.out.println("Savings Account Loan Eligibility: " + savingsAccount.calculateLoanEligibility());

        currentAccount.applyForLoan(1000);
        System.out.println("Current Account Loan Eligibility: " + currentAccount.calculateLoanEligibility());
    }
}