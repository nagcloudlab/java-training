package com.bank.mts.service;

import com.bank.mts.exception.AccountNotFoundException;
import com.bank.mts.exception.BalanceException;
import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

public class NEFTTransferService implements TransferService {

	private AccountRepository accountRepository;

	public NEFTTransferService(AccountRepository sqlAccountRepository) {
		this.accountRepository = sqlAccountRepository;
		System.out.println("NEFTTransferService instance created..");
	}

	@Override
	public boolean transfer(double amount, String fromAcNum, String toAccNum) {

		System.out.println("txr initiated..");

		Account fromAccount = accountRepository.loadAccount(fromAcNum);
		if (fromAccount == null)
			throw new AccountNotFoundException(fromAcNum + " not exist");
		Account toAccount = accountRepository.loadAccount(toAccNum);
		if (toAccount == null)
			throw new AccountNotFoundException(toAccNum + " not exist");
		System.out.println("debit & credit..");

		if (fromAccount.getBalance() < amount)
			throw new BalanceException("current balance " + fromAccount.getBalance());

		fromAccount.setBalance(fromAccount.getBalance() - amount); // debit
		toAccount.setBalance(toAccount.getBalance() + amount); // credit

		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);

		System.out.println("txr completed..");

		return true;
	}

}
