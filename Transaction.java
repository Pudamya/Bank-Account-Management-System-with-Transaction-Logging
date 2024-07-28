public class Transaction {
    String transactionType;
    double amount;
    String description;
    String transactionDate;

    Transaction(String transactionType, double amount, String description, String transactionDate) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;
        this.transactionDate = transactionDate;
    }

    //public Transaction() {
    public String toString(){
        return "Transaction [transactionType=" + transactionType + ", amount=" + amount + ", description="+description+", transactionDate="+transactionDate+"]";


    }
}
