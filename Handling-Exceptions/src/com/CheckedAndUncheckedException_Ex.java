package com;

//--------------------------------------------
// Dev-1
//--------------------------------------------

class BalanceExcepetion extends Exception {
	@Override
	public String getMessage() {
		return "no enough balance";
	}
}

class TransferService {
	public void txr(double amount, String from, String to) throws BalanceExcepetion {
		//
		double fromAccountBalance = 1000.00;
		if (amount <= fromAccountBalance) {
			// ....
		} else {
			throw new BalanceExcepetion();
		}

	}
}

//--------------------------------------------
//Dev-2
//--------------------------------------------

class FinanceService {

	TransferService transferService = new TransferService();

	public void fundTxr() {
		try {
			transferService.txr(100.00, "1", "2");
		} catch (BalanceExcepetion e) {
			e.printStackTrace();
		}
	}

}

public class CheckedAndUncheckedException_Ex {

	public static void main(String[] args) {

	}

}
