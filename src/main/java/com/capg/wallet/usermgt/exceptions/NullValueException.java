package com.capg.wallet.usermgt.exceptions;

public class NullValueException extends RuntimeException{

	public NullValueException()
	{}
	
	public NullValueException(String str)
	{
		super(str);
	}
}
