package com.capg.wallet.usermgt.dao;

import com.capg.wallet.usermgt.entities.WalletUser;

public interface IWalletUserDao {

	void addAccount(WalletUser w);
	void removeAccount(int accountId);
	WalletUser findwalletId(int accountId);
	
}
