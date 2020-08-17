package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.AccountNotFoundException;
import com.example.demo.exception.BalanceException;
import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class TxrServiceImpl implements TxrService {

	@Autowired
	private AccountRepository accountRepository;

	@Transactional
	@Override
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		Account fromAccount =
				accountRepository.findById(fromAccNum)
				.orElseThrow(()->new AccountNotFoundException(fromAccNum + " not exist"));
		Account toAccount = accountRepository.findById(toAccNum)
				.orElseThrow(()->new AccountNotFoundException(toAccNum + " not exist"));
		
		System.out.println("debit & credit..");

		if (fromAccount.getBalance() < amount)
			throw new BalanceException("current balance " + fromAccount.getBalance());

		fromAccount.setBalance(fromAccount.getBalance() - amount); // debit
		toAccount.setBalance(toAccount.getBalance() + amount); // credit

		accountRepository.save(fromAccount);
		accountRepository.save(toAccount);
		
		
		// insert txns records to Txn table

		return true;

	}

}
