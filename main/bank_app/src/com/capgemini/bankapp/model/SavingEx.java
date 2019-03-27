package com.capgemini.bankapp.model;

public class SavingEx extends BankAccount {

	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE = 10000;

	public SavingEx() {

	}

	public SavingEx(long accountId, String accountHolderName, double accountBalance, boolean salaryAccount) {
		super(accountId, accountHolderName, "SAVING", accountBalance);
		this.salaryAccount = salaryAccount;
	}

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	@Override
	public double withdraw(double amount) {
		if (salaryAccount) {
			return super.withdraw(amount);
		} else {
			if (getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount);
			else
				System.out.println("you don't have sufficient fund.");
			return getAccountBalance();
		}
	}

	@Override
	public double deposit(double amount) {
		return super.deposit(amount);

	}

}
