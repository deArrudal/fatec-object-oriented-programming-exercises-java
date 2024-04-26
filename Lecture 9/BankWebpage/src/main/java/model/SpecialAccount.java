package model;

public class SpecialAccount extends Account {
	private float specialLimit;

	public SpecialAccount(int accountId, String accountClientName, float accountBalance, float specialLimit) {
		super(accountId, accountClientName, accountBalance, "special");
		this.specialLimit = specialLimit;
	}

	public float getSpecialLimit() {
		return specialLimit;
	}

	public void setSpecialLimit(float specialLimit) {
		this.specialLimit = specialLimit;
	}

	@Override
	public void withdraw(float value) {
		if (value > getAccountBalance() + specialLimit) {
			return;
		}
		setAccountBalance(getAccountBalance() - value);
	}

}
