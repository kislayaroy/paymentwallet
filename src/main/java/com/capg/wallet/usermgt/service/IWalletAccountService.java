package com.capg.wallet.usermgt.service;

import com.capg.wallet.usermgt.entities.WalletAccount;
import com.capg.wallet.usermgt.entities.WalletUser;

public interface IWalletAccountService {

	void addAccount(WalletUser w);
	void removeAccount(int accountId);
	WalletAccount findwalletId(int accountId);
	WalletAccount addAmount(WalletUser user, double amount);
	WalletAccount deductAmount(WalletUser user, double amount);
	void transferfund(WalletUser sender,WalletUser receiver,double amount);
}
