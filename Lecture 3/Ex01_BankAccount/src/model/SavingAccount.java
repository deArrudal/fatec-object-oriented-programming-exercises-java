package model;

import java.time.LocalDate;

public class SavingAccount extends BankAccount {
    private int savingYieldDay;

    public SavingAccount() {
        super();
    }

    public int getSavingsYieldDay() {
        return savingYieldDay;
    }

    public void setSavingsYieldDay(int savingsYieldDay) {
        this.savingYieldDay = savingsYieldDay;
    }

    public void computeNewBalance(float yieldRate) {
        if (LocalDate.now().getDayOfMonth() > savingYieldDay) {
            setAccountBalance(getAccountBalance() * (1 + yieldRate));
            System.out.println("Balance updated");
        }
    }

}
