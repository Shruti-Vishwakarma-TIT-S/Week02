package com.inheritancequestions.hierarchical.bankaccount;

public class FixedDepositAccount extends BankAccount {
        private double depositTerm;

        public FixedDepositAccount(String accountNumber, double balance, double depositTerm) {
            super(accountNumber, balance);
            this.depositTerm = depositTerm;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Deposit Term: " + depositTerm + " years");
        }


    public double getDepositTerm() {
        return depositTerm;
    }
}
