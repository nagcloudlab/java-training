package com.bank.mts.service;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

// SOLID principles

public class NEFTTransferService implements TransferService {

	private AccountRepository accountRepository;

	public NEFTTransferService(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public boolean transfer(double amount, String fromAccNum, String toAccNum) {

		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		return false;
	}

}
