package com.capg.wallet.usermgt.service;

import com.capg.wallet.usermgt.dao.IWalletAccountDao;
import com.capg.wallet.usermgt.dao.IWalletUserDao;
import com.capg.wallet.usermgt.entities.WalletAccount;
import com.capg.wallet.usermgt.exceptions.*;

public class WalletAccountServiceImpl implements IWalletAccountService {

	IWalletAccountDao daoAccount;
	
	public WalletAccountServiceImpl(IWalletAccountDao daoAccount)
	{
		this.daoAccount=daoAccount;
	}
	
	@Override
	public WalletAccount addAmount(double balance, int accountId)
	{
		
		WalletAccount w=daoAccount.addAmount(balance, accountId);
		return w;
	}


	@Override
	public void transferfund(double balance, int senderId, int receiverId)
	{
		
		daoAccount.transferfund(balance,senderId,receiverId);
	}

}
