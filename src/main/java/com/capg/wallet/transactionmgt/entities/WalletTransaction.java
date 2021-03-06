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
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountbalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dateoftransaction == null) ? 0 : dateoftransaction.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + transactionid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WalletTransaction other = (WalletTransaction) obj;
		if (Double.doubleToLongBits(accountbalance) != Double.doubleToLongBits(other.accountbalance))
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (dateoftransaction == null) {
			if (other.dateoftransaction != null)
				return false;
		} else if (!dateoftransaction.equals(other.dateoftransaction))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (transactionid != other.transactionid)
			return false;
		return true;
	}
	
	
}
