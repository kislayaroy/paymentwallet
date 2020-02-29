package com.capg.wallet.transactionmgt.dao;

import com.capg.wallet.transactionmgt.entities.WalletTransaction;
import com.capg.wallet.usermgt.entities.WalletAccount;

public interface IWalletTransactionDao {

	WalletTransaction addAmount(WalletAccount account,double amount);
	
	WalletTransaction deductAmount(WalletAccount account,double amount);
	
	void tranferAmount(WalletAccount account_from,WalletAccount account_to,double amount);
	
}
