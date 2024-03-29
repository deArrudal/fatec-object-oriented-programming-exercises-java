package model;

public class Account {
    private int accountAgency;
    private int accountNumber;
    private float accountBalance;
    private float accountLimit;

    public Account() {
        super();
    }

    public int getAccountAgency() {
        return accountAgency;
    }

    public void setAccountAgency(int accountAgency) {
        this.accountAgency = accountAgency;
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

    public float getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(float accountLimit) {
        this.accountLimit = accountLimit;
    }

    public void makeDeposit(float value) {
        accountBalance += value;
    }

    public void makeWithdraw(float value) {
        if (value > (accountBalance + accountLimit)) {
            throw new ArithmeticException(String.format("Insufficient funds, Maximum Withdraw: %.2f",
                    (accountBalance + accountLimit)));
        }
        accountBalance -= value;
    }

    @Override
    public String toString() {
        return "Account [Agency=" + accountAgency + ", Number=" + accountNumber + ", Balance="
                + accountBalance + ", Limit=" + accountLimit + "]";
    }

}
