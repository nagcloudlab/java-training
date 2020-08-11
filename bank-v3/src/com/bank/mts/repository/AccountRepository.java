package com.bank.mts.repository;

import com.bank.mts.model.Account;

public interface AccountRepository {
	Account loadAccount(String number);

	boolean updateAccount(Account account);
}
