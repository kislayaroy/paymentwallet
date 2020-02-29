package com.capg.wallet.usermgt.service;

import com.capg.wallet.usermgt.entities.*;

public interface IWalletUserService {
	
	void addAccount(WalletUser w);
	void removeAccount(int accountId);
	WalletUser findwalletId(int accountId);
}
