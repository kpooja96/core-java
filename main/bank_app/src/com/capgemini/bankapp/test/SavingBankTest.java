package com.capgemini.bankapp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.SavingBankAccount;

public class SavingBankTest {

	 SavingBankAccount account;
	
	 @Before
	 public void setUp() {
		 
		 account=new SavingBankAccount(101,"John Don",34000,true);
	 }
	 
	 @Test
	 public void testSavingbankAccount() {
		 assertNotNull(account);
	 }
	
	 
	 @Test
	 public void testSavingbankAccountisParameterised() {
		 assertEquals(101, account.getAccountId());
		 assertEquals("John Don", account.getAccountHolderName());
		 assertEquals(34000, account.getAccountBalance(),0.01);
		 assertEquals("SAVING", account.getAccountType());
	 }
}



