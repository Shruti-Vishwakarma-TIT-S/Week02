public class BankAccount {
    static String bankName;
    // Shared by all accounts
    private String accountHolderName;
    // Account holder's name
    private final long accountNumber;
    // Account number (constant)
    static int count = 0;
    // Count of accounts created
    BankAccount(String bankName, String accountHolderName, long accountNumber) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        count++;
        // Increment account count
    }
    static void getTotalAccounts() {
        System.out.println("Total Bank accounts are: " + count);
        // Display total accounts
    }
    void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        // Display account details
    }
}
class Main {
    public static void main(String[] args) {
        String bankName = "SBI Bank";
        String accountHolderName = "Shruti Sharma";
        long accountNumber = 123964782365l;
        BankAccount bank = new BankAccount(bankName, accountHolderName, accountNumber);
        // Create a BankAccount object
        if(bank instanceof BankAccount) {
            System.out.println("Yes, it is an instance of BankAccount.");
            BankAccount.getTotalAccounts();
            // Display total accounts
            bank.displayAccountDetails();
            // Display account details
        } else {
            System.out.println("No, it isn't an instance of BankAccount.");
        }
    }
}
