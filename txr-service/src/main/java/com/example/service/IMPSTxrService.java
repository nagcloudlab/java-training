package com.example.service;

import java.sql.SQLException;

import com.example.exception.AccountNotFoundException;
import com.example.exception.BalanceException;
import com.example.model.Account;
import com.example.repository.AccountRepository;

public class IMPSTxrService implements TxrService {

	private AccountRepository accountRepository;

	public IMPSTxrService(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public boolean txr(double amount, String fromAccNum, String toAccNum) {
		try {
			Account fromAccount = accountRepository.loadAccount(fromAccNum);
			if (fromAccount == null)
				throw new AccountNotFoundException(fromAccNum + " not exist");
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

			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
