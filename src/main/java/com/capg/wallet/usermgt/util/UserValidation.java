package com.capg.wallet.usermgt.util;

import com.capg.wallet.usermgt.dao.WalletUserDaoImpl;
import com.capg.wallet.usermgt.entities.WalletUser;
import com.capg.wallet.usermgt.exceptions.*;

public class UserValidation {

	public boolean checkName(String userName) {
	if(userName==null)
	{
		NullValueException exception=new NullValueException("name is null");
		throw exception;
	}
	return true;
	}
	
	public boolean checkNumber(String phoneNumber) {
		if(phoneNumber.length()<10)
		{
			ValidationException exception=new ValidationException("Phone number ");
			throw exception;
		}
		return true;
	
	}
	public boolean checkUserId(int userId) {
		if(userId==0)
		{
			NullValueException exception=new NullValueException("Id is null");
			throw exception;
		}
		return true;
		}
	
	public boolean checkAccountId(int accountId) {
		WalletUserDaoImpl obj=new WalletUserDaoImpl();
		WalletUser w1= obj.findwalletId(accountId);
		
		if(w1 instanceof WalletUser)
		return true;
		else
			return false;
		}
	
}
