package com.capgemini.bankapp.service;

import java.util.List;

import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountService {
	
	public double checkBalance(long accountId);
	public double withdraw(long accountId,double amount) throws LowBalanceException;
	public double deposit(long accountId,double amount);
	public boolean deletebankAccount(long accountId);
	public boolean addNewBankAccount(BankAccount account);
	public void fundTransfer(long accountId, long accountId2, double amount);
	
	public void searchBankAccount(long accountId);
	public void searchBankAccount();
	public List<BankAccount> findAllBAnkAccounts();
	

}
