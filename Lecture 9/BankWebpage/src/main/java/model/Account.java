package model;

public abstract class Account {
	private int accountId;
	private String accountClientName;
	private float accountBalance;
	private String accountType;

	public Account(int accountId, String accountClientName, float accountBalance, String accountType) {
		this.accountId = accountId;
		this.accountClientName = accountClientName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountClientName() {
		return accountClientName;
	}

	public void setAccountClientName(String accountClientName) {
		this.accountClientName = accountClientName;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void withdraw(float value) {
		if (value > accountBalance) {
			return;
		}
		accountBalance -= value;
	}

	public void deposit(float value) {
		if (value <= 0.00f) {
			return;
		}
		accountBalance += value;
	}

	@Override
	public String toString() {
		return "Account [Id=" + accountId + ", Client=" + accountClientName + ", Balance=" + accountBalance + "]";
	}

}
