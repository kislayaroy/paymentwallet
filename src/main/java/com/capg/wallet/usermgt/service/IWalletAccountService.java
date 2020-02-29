package com.capg.wallet.usermgt.service;

import com.capg.wallet.usermgt.entities.WalletAccount;

public interface IWalletAccountService {


	WalletAccount addAmount(double balance,int userId);
	void transferfund(double balance,int senderId,int receiverId);
}
