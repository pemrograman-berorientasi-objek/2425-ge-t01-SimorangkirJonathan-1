package fintech.model;

/**
 * @author 12S23030 - Simorangkir Jonathan
 * @author 12S23046 - Anastasya T.B. Siahaan
 */
public class Transaction {

    private static int nextId = 0;
    private int id;
    {
        nextId++;
        id = nextId;
    }
    private String accountName2;
    private double amount;
    private String postedat;
    private String note;
    private Account account;

    public Transaction(int _id, String _accountName2, double _amount, String _postedat, String _note, Account account) {
        this.accountName2 = _accountName2;
        this.amount = _amount;
        this.postedat = _postedat;
        this.note = _note;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName2;
    }

    public double getAmount() {
        return amount;
    }

    public String getPostedat() {
        return postedat;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return this.id + "|" + this.accountName2 + "|" + this.amount + "|" + this.postedat + "|" + this.note + "|"
                + (account.getBalance() + this.amount);
    }

}