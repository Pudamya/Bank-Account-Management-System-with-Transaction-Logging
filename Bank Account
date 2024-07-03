import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    List<Transaction> transactions;


    BankAccount() {
        this.accountHolderName = "Unknown";
        this.accountNumber = "000000";
        this.balance = 0.0;
        this.transactions = new ArrayList<Transaction>();
    }
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }
    void deposit(double amount){

        balance = balance + amount;
        logTransaction(new Transaction("Deposit",amount,"Deposited","2024-06-30"));

    }
    void deposit(String description, double amount){
        balance = balance + amount;
        logTransaction(new Transaction("Deposit",amount,description,"2024.06.30"));
        //System.out.println(description);
    }
    void withdraw(double amount){
        if (balance >= amount){
            balance = balance - amount;
            logTransaction(new Transaction("Withdrawal",amount,"Withdrew","2024-06-30"));
        }else {
            System.out.println("Insufficient funds");
        }
    }

    void withdraw(String description, double amount){
        if (balance >= amount){
            balance = balance - amount;
            logTransaction(new Transaction("Withdrawal",amount,description,"2024-06-30"));
            System.out.println(description);

        }else {
            System.out.println("Insufficient funds");
        }
    }

    void logTransaction(Transaction transaction){
        transactions.add(transaction);
        //System.out.println(transaction);
    }

    void displayAccountDetails(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    void displayTransactionHistory(){
        System.out.println("Transaction History List: ");
        for(Transaction transaction : transactions){
            System.out.println(transaction);

        }

    }



}
