package com.bank.mts;

import com.bank.mts.repository.SQLAccountRepository;
import com.bank.mts.repository.SQLAccountRepository_v1;
import com.bank.mts.repository.SQLAccountRepository_v2;
import com.bank.mts.repository.SQLAccountRepository_v3;
import com.bank.mts.service.NEFTTransferService;

public class App {

	public static void main(String[] args) {
		System.out.println("App started..");

		// booting / init phase
		System.out.println();
		
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		
		SQLAccountRepository sqlAccountRepository_v1=new SQLAccountRepository_v1(); // 50%
		SQLAccountRepository sqlAccountRepository_v2=new SQLAccountRepository_v2(); // 80%
		SQLAccountRepository sqlAccountRepository_v3=new SQLAccountRepository_v3(); // 90%
		
		NEFTTransferService neftTransferService = new NEFTTransferService(sqlAccountRepository_v3);
		System.out.println();

		// use phase
		neftTransferService.transfer(300.00, "1", "2");
		System.out.println();
		neftTransferService.transfer(300.00, "2", "1");

		// destroy phase
		// .....
		System.out.println();
		System.out.println("App closed..");
	}

}
