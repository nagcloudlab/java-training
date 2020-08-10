package com.bank.mts.model;

// data
public class Account {

	private String number;
	private double balance;
	private AccountType accountType; // SAVING | CURRENT

	public Account() {
		// ..
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

}
