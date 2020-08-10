package com.bank.mts;

import com.bank.mts.service.NEFTTransferService;

public class App {

	public static void main(String[] args) {
		System.out.println("App started..");

		// booting / init phase
		System.out.println();
		NEFTTransferService neftTransferService = new NEFTTransferService();
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
