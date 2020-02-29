package com.capg.wallet.transactionmgt.entities;

import java.time.LocalDateTime;

public class WalletTransaction {
	private int transactionid;
	private String description;
	private LocalDateTime dateoftransaction;
	private double amount;
	private double accountbalance;
	
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDateoftransaction() {
		return dateoftransaction;
	}
	public void setDateoftransaction(LocalDateTime dateoftransaction) {
		this.dateoftransaction = dateoftransaction;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public WalletTransaction() {
		
	}
	
	public WalletTransaction(int transactionid,String description,LocalDateTime dateoftransaction,double amount,double accountbalance) {
		this.transactionid=transactionid;
		this.description=description;
		this.dateoftransaction=dateoftransaction;
		this.amount=amount;
		this.accountbalance=accountbalance;
	}
	
	
	@Override
	public int hashCode() {
		return transactionid;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WalletTransaction obj2 = (WalletTransaction) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(obj2.amount))
			return false;
		return true;
	}
}
