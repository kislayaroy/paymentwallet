package com.capg.wallet.usermgt.exceptions;

public class IncorrectValueException extends RuntimeException{

	public IncorrectValueException()
	{}
	
	public IncorrectValueException(String msg)
	{
		super(msg);
	}
}
