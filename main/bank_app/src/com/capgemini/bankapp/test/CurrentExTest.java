package com.capgemini.bankapp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankapp.model.CurrentEx;

public class CurrentExTest {

	private CurrentEx account;
	
	@Before
	public void setUp()
	{
		account =  new CurrentEx(101,"John Don",35000, 0);
	}
	
	
	
	@Test(expected=DebitLimitExceeded.class)
	public void testWithdrawWithDebitLimitExceeded()
	{
		account.withdraw(65000);
		account.withdraw(5000);
	}

}
