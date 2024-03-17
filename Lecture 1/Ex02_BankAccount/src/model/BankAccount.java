package model;

public class BankAccount {
    public int accountNumber = 000;
    public String accountUserName = "";
    public double accountBalance = 0.00;

    public BankAccount() {
        super();
    }

    public void makeDeposit(double value) {
        if (value <= 0) {
            System.err.println("Invalid value");
            return;
        }
        accountBalance += value;
    }

    public void makeWithdraw(double value) {
        if (value > accountBalance) {
            System.err.println("Invalid value");
            return;
        }
        accountBalance -= value;
    }
}
