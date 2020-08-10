package com.bank.mts.repository;

import com.bank.mts.model.Account;

public class AccountRepository_v1 implements AccountRepository {

	@Override
	public Account load(String number) {

		Account account = new Account();
		account.setNumber(number);
		account.setBalance(1000.00);
		return account;
	}

	@Override
	public boolean update(Account account) {
		return false;
	}

}
