package com.encapsulation.bankingsystem;

// Class representing a Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Interest rate for savings account

    public SavingsAccount(String accountNumber, String holderName, double initialBalance, double interestRate) {
        super(accountNumber, holderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate; // Interest calculation
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for " + amount + " submitted for Savings Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 1000; // Example eligibility criteria
    }
}