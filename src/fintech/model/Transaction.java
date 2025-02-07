package fintech.model;

/**
 * @author
 */
public class Transaction {
    private String transactionId;
    private String accountName;
    private double amount;
    private String type; // "credit" or "debit"

    public Transaction(String transactionId, String accountName, double amount, String type) {
        this.transactionId = transactionId;
        this.accountName = accountName;
        this.amount = amount;
        this.type = type;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.transactionId + "|" + this.accountName + "|" + this.amount + "|" + this.type;
    }
}