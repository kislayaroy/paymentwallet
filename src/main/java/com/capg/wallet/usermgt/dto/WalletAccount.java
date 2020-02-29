package com.capg.wallet.usermgt.dto;

import java.util.*;

public class WalletAccount {
	int accountId;
	public double accountBalance;
	enum status{active,non_active};
	List<Integer> transactionHistory;
	
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
	
	public List<Integer> getTransactionHistory() {
		return transactionHistory;
	}
	public void setTransactionHistory(List<Integer> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	public WalletAccount()
	{
		
	}

	public WalletAccount(int accountId,double accountBalance)
	{
		super();
		this.accountId=accountId;
		this.accountBalance=accountBalance;
		
	}
	
}
