package com.bank.mts.service;

import com.bank.mts.model.Account;
import com.bank.mts.repository.SQLAccountRepository;

/**
 * 
 * @author Matthew
 *
 */

/*
 * 
 * 
 *  design & performance issues
 *  ---------------------------
 *  
 *  
 * 
 */

public class NEFTTransferService {

	public NEFTTransferService() {
		System.out.println("NEFTTransferService instance created..");
	}

	public boolean transfer(double amount, String fromAcNum, String toAccNum) {

		System.out.println("txr initiated..");

		SQLAccountRepository sqlAccountRepository = new SQLAccountRepository();

		Account fromAccount = sqlAccountRepository.loadAccount(fromAcNum);
		Account toAccount = sqlAccountRepository.loadAccount(toAccNum);

		System.out.println("debit & credit..");
		fromAccount.setBalance(fromAccount.getBalance() - amount); // debit
		toAccount.setBalance(toAccount.getBalance() + amount); // credit

		sqlAccountRepository.updateAccount(fromAccount);
		sqlAccountRepository.updateAccount(toAccount);

		System.out.println("txr completed..");

		return true;
	}

}
