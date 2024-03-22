package view;

import model.SavingAccount;
import model.SpecialAccount;

public class Main {
    public static void main(String[] args) {
        SpecialAccount spcAccount = new SpecialAccount();
        spcAccount.setAccountNumber(1);
        spcAccount.setAccountUserName("John Doe");
        spcAccount.setAccountBalance(1500f);
        spcAccount.setSpecialLimit(1000f);

        SavingAccount svgAccount = new SavingAccount();
        svgAccount.setAccountNumber(2);
        svgAccount.setAccountUserName("Mike Costa");
        svgAccount.setAccountBalance(1250f);
        svgAccount.setSavingsYieldDay(7);

        spcAccount.withdrawValue(500f);
        System.out.printf("Balance: %.2f\n", spcAccount.getAccountBalance());

        svgAccount.withdrawValue(500f);
        System.out.printf("Balance: %.2f\n", svgAccount.getAccountBalance());

        spcAccount.withdrawValue(1500f);
        System.out.printf("Balance: %.2f\n", spcAccount.getAccountBalance());

        svgAccount.withdrawValue(800f);
        System.out.printf("Balance: %.2f\n", svgAccount.getAccountBalance());

        spcAccount.depositValue(1500f);
        System.out.printf("Balance: %.2f\n", spcAccount.getAccountBalance());

        svgAccount.depositValue(1500f);
        System.out.printf("Balance: %.2f\n", svgAccount.getAccountBalance());

        svgAccount.computeNewBalance(0.1f);
        System.out.printf("Balance: %.2f\n", svgAccount.getAccountBalance());

        System.out.printf("Account number: %d\n", spcAccount.getAccountNumber());
        System.out.printf("Account user: %s\n", spcAccount.getAccountUserName());
        System.out.printf("Balance: %.2f\n", spcAccount.getAccountBalance());
    }
}