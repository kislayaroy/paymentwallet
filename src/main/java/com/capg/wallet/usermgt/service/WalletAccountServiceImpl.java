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

	public WalletAccountServiceImpl(IWalletAccountDao daoAccount, IWalletTransactionDao transDao) {
		this.accountDao = daoAccount;
		this.transactionDao = transDao;
	}

	

	@Override
	public void addAccount(WalletUser w) {
		accountDao.addAccount(w);
	}

	@Override
	public void removeAccount(int userId) {
		accountDao.removeAccount(userId);
	}

	@Override
	public WalletAccount findwalletId(int userId) {
		WalletAccount w = accountDao.findwalletId(userId);
		return w;
	}

	@Override
	public WalletAccount addAmount(WalletUser user, double amount) {
		if (!AddAmountValidation.checkAmount(amount)) {
			System.out.println("Enter valid amount");

		}

		WalletAccount w = accountDao.addAmount(user, amount);
		transactionDao.addAmount(w, amount);
		return w;
	}

	@Override
	public WalletAccount deductAmount(WalletUser user, double amount) {
		if (!AddAmountValidation.checkAmount(amount)) {
			System.out.println("Enter valid amount");

		}

		WalletAccount w = accountDao.deductAmount(user, amount);
		transactionDao.deductAmount(w, amount);
		return w;
	}

	@Override
	public void transferfund(WalletUser sender,WalletUser receiver,double amount) {
		if (!AddAmountValidation.checkAmount(amount)) {
			System.out.println("Enter valid amount");
		}
		accountDao.transferfund(sender, receiver, amount);
	}

}
