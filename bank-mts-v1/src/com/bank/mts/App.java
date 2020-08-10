package com.bank.mts;

import com.bank.mts.repository.AccountRepository_v1;
import com.bank.mts.service.NEFTTransferService;
import com.bank.mts.service.TransferService;

public class App {

	public static void main(String[] args) {

		TransferService transferService = new NEFTTransferService(new AccountRepository_v1());
		transferService.transfer(1000.00, "1", "2");

	}

}
