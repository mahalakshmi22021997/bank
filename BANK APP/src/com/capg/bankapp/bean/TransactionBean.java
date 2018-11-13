package com.capg.bankapp.bean;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class TransactionBean {
	
	private Double deposit;
	private Double withDraw;
	private String transactionType;
	private Date dateTime;
	
	
	
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getWithDraw() {
		return withDraw;
	}
	public void setWithDraw(Double withDraw) {
		this.withDraw = withDraw;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	@Override
	public String toString() {
		return "TransactionBean [deposit=" + deposit + ", withDraw=" + withDraw + ", transactionType=" + transactionType
				+ ", dateTime=" + dateTime + "]";
	}
	
}
