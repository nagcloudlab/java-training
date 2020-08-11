package com.bank.mts;

import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.SQLAccountRepository;
import com.bank.mts.service.NEFTTransferService;
import com.bank.mts.service.TransferService;

public class App {

	public static void main(String[] args) {
		System.out.println("App started..");

		// booting / init phase
		System.out.println();

		AccountRepository sqlAccountRepository = new SQLAccountRepository();

		TransferService neftTransferService = new NEFTTransferService(sqlAccountRepository);
		System.out.println();

		// use phase
		neftTransferService.transfer(3000.00, "1", "2");
		System.out.println();
		neftTransferService.transfer(300.00, "2", "1");

		// destroy phase
		// .....
		System.out.println();
		System.out.println("App closed..");
	}

}
