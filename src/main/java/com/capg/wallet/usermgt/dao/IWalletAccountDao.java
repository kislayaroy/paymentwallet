package com.capg.wallet.usermgt.dao;

import com.capg.wallet.usermgt.entities.WalletAccount;

public interface IWalletAccountDao {
	
	WalletAccount addAmount(double balance,int accountId);
	WalletAccount dedectAmount(double balance,int accountId);
	void transferfund(double balance,int senderId,int receiverId);
}
