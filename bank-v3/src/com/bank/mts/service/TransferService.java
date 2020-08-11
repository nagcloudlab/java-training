package com.bank.mts.service;

public interface TransferService {

	boolean transfer(double amount, String fromAcNum, String toAccNum);

}