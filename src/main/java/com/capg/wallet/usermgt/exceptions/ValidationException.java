package com.capg.wallet.usermgt.exceptions;

public class ValidationException extends RuntimeException{

	public ValidationException()
	{}
	
	public ValidationException(String str)
	{
		super(str);
	}
}
