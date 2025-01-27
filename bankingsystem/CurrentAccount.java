package com.encapsulation.bankingsystem;

// Class representing a Current Account
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit; // Overdraft limit for current account

    public CurrentAccount(String accountNumber, String holderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.03; // Fixed interest rate for current account
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for " + amount + " submitted for Current Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 500; // Example eligibility criteria
    }
}