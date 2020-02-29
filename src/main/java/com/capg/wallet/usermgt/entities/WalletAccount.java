package com.capg.wallet.usermgt.entities;

public class WalletAccount {
int accountId;
public double accountBalance;
Enum status;
//transactionHistory

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
public Enum getStatus() {
	return status;
}
public void setStatus(Enum status) {
	this.status = status;
}
public WalletAccount()
{}

public WalletAccount(int accountId,double accountBalance)
{
	this.accountId=accountId;
	this.accountBalance=accountBalance;
	
}

@Override
public int hashCode()
{
	return accountId;
}

@Override
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	
	
	return true;
}
}
