package com.capg.wallet.usermgt.dao;

import com.capg.wallet.usermgt.entities.*;
import java.util.*;
import com.capg.wallet.usermgt.exceptions.*;

public class WalletAccountDaoImpl implements IWalletAccountDao {

	public static Map<Integer, UserAndAccount> store = new HashMap<>();

	private int generatedId;

	public int generateId() {
		return ++generatedId;
	}

	@Override
	public void addAccount(WalletUser user) {
		int accountId = generateId();
		WalletAccount account = new WalletAccount();
		account.setAccountId(accountId);
		UserAndAccount userAccount = new UserAndAccount(user, account);
		store.put(user.getUserId(), userAccount);
	}

	@Override
	public void removeAccount(int userId) {
		store.remove(userId);
	}

	@Override
	public WalletAccount findwalletId(int userId) {
		UserAndAccount userAccount = store.get(userId);
		WalletAccount account=userAccount.getAccount();
		return account;
	}

	@Override
	public WalletAccount addAmount(WalletUser user, double amount) {
		
		int userId=user.getUserId();
		UserAndAccount userAccount= store.get(userId);
		WalletAccount account=userAccount.getAccount();
		double balance=account.getAccountBalance();
		double newBalance=balance+amount;
		account.setAccountBalance(newBalance);
		return account;
	}

	@Override
	public WalletAccount deductAmount(WalletUser user, double amount) {
		int userId=user.getUserId();
		UserAndAccount userAccount= store.get(userId);
		WalletAccount account=userAccount.getAccount();
		double balance=account.getAccountBalance();
		double newBalance=balance-amount;
		account.setAccountBalance(newBalance);
		return account;
	}

	@Override
	public void transferfund(WalletUser sender,WalletUser receiver,double amount) {
		addAmount(receiver,amount);
		deductAmount(sender,amount);
	}
}
