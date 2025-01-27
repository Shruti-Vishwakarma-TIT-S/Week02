package com.inheritancequestions.hierarchical.bankaccount;

public class Test {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA123", 2000.0, 500.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD123", 5000.0, 1.0);

        savings.displayDetails();
        checking.displayDetails();
        fixedDeposit.displayDetails();
    }
}
