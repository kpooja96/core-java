package com.capgemini.bankapp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankapp.model.CurrentBankAccount;

public class CurrentBankTest {

	private CurrentBankAccount account;
	
	@Before
	public void setUp()
	{
		account = new CurrentBankAccount(101,"John Don",55000,50000);
	}
	

	@Test
	public void  testWithdrawWithSufficientbalance()
	{
		assertEquals(5000, account.withdraw(50000),0.01);
	}
	
	
	@Test
	
	public void testWithdrawWithSufficientDebitLimit()
	{
		account.withdraw(5000);
		assertEquals(50000, account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawWithSufficientDebitLimitExceededAndDeposit()
	{
		account.withdraw(65000);
		assertEquals(0,account.getAccountBalance(),0.01);
		
		account.withdraw(15000);
		assertEquals(0,account.getAccountBalance(),0.01);
		
		account.withdraw(35000);
		assertEquals(0,account.getAccountBalance(),0.01);
	
	}
	
	@Test
	public void testdeposit() {
		account.deposit(35000);
		assertEquals(90000,account.getAccountBalance(),0.01);
		
	}
}
