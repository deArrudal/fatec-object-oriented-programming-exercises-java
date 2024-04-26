package model;

import java.time.LocalDate;

public class SavingAccount extends Account {
	private int savingYieldDay;
	private boolean isSavingComputed;

	public SavingAccount(int accountId, String accountClientName, float accountBalance, int savingYieldDay,
			boolean isSavingComputed) {
		super(accountId, accountClientName, accountBalance, "saving");
		this.savingYieldDay = savingYieldDay;
		this.isSavingComputed = isSavingComputed;
	}

	public int getSavingsYieldDay() {
		return savingYieldDay;
	}

	public void setSavingsYieldDay(int savingsYieldDay) {
		this.savingYieldDay = savingsYieldDay;
	}

	public void computeNewBalance(float yieldRate) {
		if (LocalDate.now().getDayOfMonth() == savingYieldDay && !isSavingComputed) {
			setAccountBalance(getAccountBalance() * (1 + yieldRate));
			isSavingComputed = true;
		} else if (LocalDate.now().getDayOfMonth() != savingYieldDay) {
			isSavingComputed = false;
		}
	}
	
}
