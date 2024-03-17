package view;

import model.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.accountNumber = 001;
        account.accountUserName = "John Doe";
        account.accountBalance = 100.00;

        System.out.printf("Account: %d\n", account.accountNumber);
        System.out.printf("User: %s\n", account.accountUserName);
        System.out.printf("Balance: %.2f\n", account.accountBalance);

        account.makeDeposit(150.00);
        System.out.printf("Balance: %.2f\n", account.accountBalance);

        account.makeDeposit(-10.00);
        System.out.printf("Balance: %.2f\n", account.accountBalance);

        account.makeWithdraw(50.00);
        System.out.printf("Balance: %.2f\n", account.accountBalance);

        account.makeWithdraw(350.00);
        System.out.printf("Balance: %.2f\n", account.accountBalance);

    }
}
