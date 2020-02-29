package com.capg.wallet.usermgt.dao;

import java.util.*;
import com.capg.wallet.usermgt.entities.WalletUser;
import com.capg.wallet.usermgt.exceptions.*;

public class WalletUserDaoImpl implements IWalletUserDao {
	
	Map<Integer, WalletUser> store = new HashMap<>();
	
	@Override
	public void addAccount(WalletUser w) 
	{
		 store.put(w.getUserId(), w);
	}
	
	
	@Override
	public void removeAccount(int userId) 
	{
		store.remove(userId);
		/*
		if(store.containsKey(userId))
		{
			store.remove(userId);
		}
		else
		{
			ValidationException exception=new ValidationException();
			throw exception;
		}*/
	}
	
	@Override
	public WalletUser findwalletId(int userId) 
	{
		WalletUser w  = store.get(userId);
		return w;
		/*if(!store.containsKey(userId))
		{
			AccountNotFoundException exception=new AccountNotFoundException("Account not found");
			throw exception ;
		}
		WalletUser w  = store.get(userId);
		return w;*/
	}
}
