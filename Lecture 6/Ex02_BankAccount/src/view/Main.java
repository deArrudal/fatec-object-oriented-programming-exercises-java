package view;

import model.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(001);
        account.setAccountAgency(123);
        account.setAccountBalance(2500.00f);
        account.setAccountLimit(1000.00f);

        System.out.println(account.toString());

        System.out.println("Deposit: 500.00");
        account.makeDeposit(500.00f);
        System.out.printf("Balance: %.2f\n", account.getAccountBalance());

        System.out.println("Withdraw: 4500.00");
        try {
            account.makeWithdraw(4500.00f);
        } catch (ArithmeticException arithmeticException) {
            System.err.println(arithmeticException.getMessage());
        }

        System.out.println("Withdraw: 1500.00");
        account.makeWithdraw(1500.00f);
        System.out.printf("Balance: %.2f\n", account.getAccountBalance());


    }
}