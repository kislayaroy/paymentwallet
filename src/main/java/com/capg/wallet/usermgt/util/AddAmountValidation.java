package com.capg.wallet.usermgt.util;

import com.capg.wallet.usermgt.dao.WalletAccountDaoImpl;
import com.capg.wallet.usermgt.entities.WalletAccount;
import com.capg.wallet.usermgt.exceptions.*;

public class AddAmountValidation {

	public static boolean checkAmount(double balance)
	{		
		
		WalletAccountDaoImpl obj=new WalletAccountDaoImpl();
		if(balance<=0)
		{
			IncorrectValueException exception=new IncorrectValueException("Incorrect Value Exception");
			throw exception ;
		}
		
		/*if(!store.containsKey(accountId))
		{
			AccountNotFoundException exception=new AccountNotFoundException("Account not found");
			throw exception ;
		}*/
		
		return true;
	}
}
