package example.project.GodClassExample;

public class BankAccount {

    String owner;
    String accountNumber;
    double balance;
    double interest;

    public BankAccount(String owner, String accountNumber, double balance, double interest) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Object getAccountNumber() {
        return accountNumber;
    }

    public double obtainBalance() {
        return (this.getBalance());
    }

    public void addInterest() {
        // double interest = this.getInterest();
        double value = balance * interest;
        // this.setBalance( balance + value);
        balance = balance + value;
    }
}
