package com.bank.mts.repository;

import com.bank.mts.model.Account;

public interface SQLAccountRepository {
	Account loadAccount(String number); // abstract

	boolean updateAccount(Account account); // abstract
}
