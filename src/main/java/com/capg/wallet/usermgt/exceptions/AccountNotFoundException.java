package com.capg.wallet.usermgt.exceptions;

public class AccountNotFoundException extends RuntimeException{

	public AccountNotFoundException() 
	{}
	
	public AccountNotFoundException(String str) 
	{
		super(str);
	}
}
