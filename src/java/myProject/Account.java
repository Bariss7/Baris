package myProject;

public class Account {

    private int accountNumber;
    private int amount;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(int accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void depozit(int amount){
        this.amount += amount;
    }

    public boolean withdraw(int amount){
        if (amount > this.amount){
            return false;
        }
        this.amount -= amount;
        return true;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", amount=" + amount +
                '}';
    }
}
