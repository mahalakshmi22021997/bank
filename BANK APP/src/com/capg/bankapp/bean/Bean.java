package com.capg.bankapp.bean;

import java.math.BigInteger;

public class Bean {

	private String phNo;
	
	private  double balance;
	
	private String phno2;
	private double amount;

	

	

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPhno2() {
		return phno2;
	}

	public void setPhno2(String phno2) {
		this.phno2 = phno2;
	}

	@Override
	public String toString() {
		return "Bean [phNo=" + phNo + "]";
	}
	
	
	
		
	
	
	
}
