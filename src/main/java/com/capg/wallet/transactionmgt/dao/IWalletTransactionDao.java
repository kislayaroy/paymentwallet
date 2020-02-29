package com.capg.wallet.transactionmgt.dao;

import com.capg.wallet.transactionmgt.entities.WalletTransaction;

public interface IWalletTransactionDao {

	WalletTransaction addAmount(WalletAccount account,double amount);
	
	WalletTransaction deductAmount(WalletAccount account,double amount);
	
	void tranferAmount(WalletAccount account_from,WalletAccount account_to,double amount);
	
}
