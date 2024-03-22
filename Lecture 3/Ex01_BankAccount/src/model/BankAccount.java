package model;

public class BankAccount {
    private String accountUserName;
    private int accountNumber;
    private float accountBalance;

    public BankAccount() {
        super();
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdrawValue(float value) {
        if (value > accountBalance) {
            System.out.println("Invalid value");
            return;
        }
        accountBalance -= value;
        System.out.println("Withdrawal complete");
    }

    public void depositValue(float value) {
        accountBalance += value;
        System.out.println("Deposit complete");
    }

}
