package com.capgemini.bankapp.test;

public class LowBalanceException extends Exception
{
	public LowBalanceException(String message)
	{
		super(message);
	}
}
