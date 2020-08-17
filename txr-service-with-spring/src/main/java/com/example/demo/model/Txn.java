package com.example.demo.model;

import java.time.LocalDateTime;

public class Txn {

	private int id;
	private double amount;
	private LocalDateTime localDateTime;
	private String remarks;
	
	// account
	
	// Type ( credit | debit )

	public Txn(int id, double amount, LocalDateTime localDateTime, String remarks) {
		super();
		this.id = id;
		this.amount = amount;
		this.localDateTime = localDateTime;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
