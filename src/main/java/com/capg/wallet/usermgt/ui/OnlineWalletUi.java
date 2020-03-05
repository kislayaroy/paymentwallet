package com.capg.wallet.usermgt.ui;

import java.util.Collection;

import com.capg.wallet.transactionmgt.dao.WalletTransactionDaoImpl;
import com.capg.wallet.usermgt.dao.*;
import com.capg.wallet.usermgt.entities.*;
import com.capg.wallet.usermgt.service.*;

public class OnlineWalletUi {
//static IWalletUserService userService=new WalletUserServiceImpl(new WalletUserDaoImpl());
	 

	public static void main(String[] args) {
		IWalletAccountService accountService = new WalletAccountServiceImpl(new WalletAccountDaoImpl(),
				new WalletTransactionDaoImpl());
		OnlineWalletUi execute = new OnlineWalletUi();
		WalletUser w1 = new WalletUser(23234, "Vaishnavi", "123@abc", "846103401", "Vaishnavirgh");

		WalletAccount wa1 = new WalletAccount(23234, 5000);
		// UserAndAccount obj=new UserAndAccount(w1,wa1);
		// WalletUser w2=new
		// WalletUser(23345,"Rashika","234@aug","9561403401","Rashikap");
		// WalletAccount wa2= new WalletAccount(23455,5000);

		accountService.addAccount(w1);
		WalletAccount walletaccount1 = accountService.addAmount(w1, 500);
		execute.print(w1, walletaccount1);

		// accountService.transferfund(w2,w1,5000);
		// execute.print(w1,wa1);
	}

	void print(WalletUser w, WalletAccount wa) {
		System.out.println(w.getUserName() + " phone number: " + w.getPhoneNumber() + " account balance "
				+ wa.getAccountBalance());
	}

	/*
	 * void print(Collection<WalletUser> users) { for(WalletUser w:users) print(w);
	 * }
	 */
}
