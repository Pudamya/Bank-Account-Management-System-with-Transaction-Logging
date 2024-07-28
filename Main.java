import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Sunil","123456");
        BankAccount account3 = new BankAccount("Kamal","789101",1000);

        account1.deposit(500);
        account1.deposit("Income",600);

        account1.withdraw(200);

        account2.deposit(400);
        account2.withdraw(50);

        account3.deposit(300);
        account3.deposit("FD income",1000);
        account3.withdraw(100);

        account1.displayAccountDetails();
        System.out.println();
        account1.displayTransactionHistory();
        System.out.println();
        System.out.println();

        account2.displayAccountDetails();
        System.out.println();
        account2.displayTransactionHistory();
        System.out.println();
        System.out.println();

        account3.displayAccountDetails();
        System.out.println();
        account3.displayTransactionHistory();
        System.out.println();
        System.out.println();


    }

}
