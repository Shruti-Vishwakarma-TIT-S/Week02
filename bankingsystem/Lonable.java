package com.encapsulation.bankingsystem;

// Interface representing Loanable accounts
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}