package com.capg.wallet.usermgt.entities;

import java.util.List;

import com.capg.wallet.transactionmgt.entities.WalletTransaction;

public class WalletAccount {
private int accountId;
private double accountBalance;
enum status{
	active,
	not_active
	};
List<WalletTransaction> transactionHistory;

public List<WalletTransaction> getTransactionHistory() {
	return transactionHistory;
}
public void setTransactionHistory(List<WalletTransaction> transactionHistory) {
	this.transactionHistory = transactionHistory;
}
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public WalletAccount()
{
	
}

public WalletAccount(int accountId,double accountBalance)
{
	this.accountId=accountId;
	this.accountBalance=accountBalance;
	
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((transactionHistory == null) ? 0 : transactionHistory.hashCode());
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
	WalletAccount other = (WalletAccount) obj;
	if (transactionHistory == null) {
		if (other.transactionHistory != null)
			return false;
	} else if (!transactionHistory.equals(other.transactionHistory))
		return false;
	return true;
}
}