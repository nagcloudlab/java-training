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
 * design & performance issues 
 * 
 *  => dependent & dependency objects are tightly-coupled
 *  	=> can't extend obj with new features easily
 *  => too many duplicate dependency instances created & discarded
 *  	=> slow, resource use high,..
 *  => Unit-Testing not possible
 *  	=> dev & bug-fix slow
 * 
 * ----------------------------------------------------------------
 * 
 * why these issues here ?
 * 
 * 
 *  ==> dependent object itself creating it's own dependency.
 * 
 * 
 * soln :
 * 
 *  ==> Dont create  dependency obj in dependent's home ( class ) , use 'Factory'   ( Factory design pattern )
 * 
 * 
 *  Limitation with Factory
 *  
 *  ==> dependent must know from which factory can get right dependency  
 *  
 *  best soln :
 *  
 *  
 *  ==>  Dont create/lookup , inject by 'third-party'  ( IOC ==> Inversion Of Control )
 * 
 * 
 *       How to implement IOC ?
 *       
 *       	way-1 : dependency injection ( DI )
 *       		
 *       	types :
 *       
 *       			==> thru constructor
 *                  ==> thru method
 *       
 *          way-2 : AOP ( Aspect oriented Programming )
 * 
 */

public class NEFTTransferService {
	
	private SQLAccountRepository  sqlAccountRepository; // reference variable

	// dependency injection
	public NEFTTransferService(SQLAccountRepository sqlAccountRepository) {
		this.sqlAccountRepository=sqlAccountRepository;
		System.out.println("NEFTTransferService instance created..");
	}

	public boolean transfer(double amount, String fromAcNum, String toAccNum) {

		System.out.println("txr initiated..");

//		SQLAccountRepository_v1 sqlAccountRepository = new SQLAccountRepository_v1(); //

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
