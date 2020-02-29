package com.capg.wallet.usermgt.dao;
import com.capg.wallet.usermgt.entities.*;
import java.util.*;
import com.capg.wallet.usermgt.exceptions.*;

public class WalletAccountDaoImpl implements IWalletAccountDao{

	Map<Integer, WalletAccount> store = new HashMap<>();
	
	@Override
	public WalletAccount addAmount(double balance,int accountId)
	{		
		WalletAccount w=store.get(accountId);
		w.accountBalance=w.getAccountBalance()+ balance;
		return w;
	}
	
	/*
	public void displayAmount(int accountId)
	{
		if(!store.containsKey(accountId))
		{
			AccountNotFoundException exception=new AccountNotFoundException("Account not found");
			throw exception ;
		}
		else
		{
			WalletAccount w=store.get(accountId);
			System.out.println(w.accountBalance+" has balance= "+w.getAccountBalance());
		}
	}*/
	
	@Override
	public void transferfund(double balance,int senderId,int receiverId) 
	{
		
		WalletAccount w1=store.get(senderId);
		WalletAccount w2=store.get(receiverId);
		w2.accountBalance=w2.accountBalance+balance;
		w1.accountBalance=w1.accountBalance-balance;
	}
}
