package com.capg.wallet.usermgt.service;

import com.capg.wallet.transactionmgt.dao.IWalletTransactionDao;
import com.capg.wallet.usermgt.dao.IWalletAccountDao;
import com.capg.wallet.usermgt.dao.IWalletUserDao;
import com.capg.wallet.usermgt.entities.WalletAccount;
import com.capg.wallet.usermgt.entities.WalletUser;
import com.capg.wallet.usermgt.exceptions.*;
import com.capg.wallet.usermgt.util.AddAmountValidation;

public class WalletAccountServiceImpl implements IWalletAccountService {

	private IWalletAccountDao accountDao;
	private IWalletTransactionDao transactionDao;
	public WalletAccountServiceImpl(IWalletAccountDao daoAccount,IWalletTransactionDao transDao)
	{
		this.accountDao=daoAccount;
		this.transactionDao=transDao;
	}

	@Override
	public WalletAccount addAmount(double amount, int accountId)
	{
	
		WalletAccount w=accountDao.addAmount(amount, accountId);
		transactionDao.addAmount(w, amount);
		return w;
	}


	@Override
	public void transferfund(double amount, int senderId, int receiverId)
	{
	
		daoAccount.transferfund(amount,senderId,receiverId);
		
	}

}
