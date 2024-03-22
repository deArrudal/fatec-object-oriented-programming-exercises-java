package model;

public class SpecialAccount extends BankAccount {
    private float specialLimit;

    public SpecialAccount() {
        super();
    }

    public float getSpecialLimit() {
        return specialLimit;
    }

    public void setSpecialLimit(float specialLimit) {
        this.specialLimit = specialLimit;
    }

    @Override
    public void withdrawValue(float value) {
        if (value > getAccountBalance() + specialLimit) {
            System.out.println("Invalid value");
            return;
        }
        setAccountBalance(getAccountBalance() - value);
        System.out.println("Withdrawal complete");
    }

}
