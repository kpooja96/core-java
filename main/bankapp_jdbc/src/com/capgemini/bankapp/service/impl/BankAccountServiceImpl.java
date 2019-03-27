package com.capgemini.bankapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.util.DbUtil;
import com.capgemini.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {

	private BankAccountDao bankAccountDao;

	public BankAccountServiceImpl() {
		bankAccountDao = new BankAccountDaoImpl();

	}

	@Override
	public double checkBalance(long accountId) {

		return bankAccountDao.getbalance(accountId);
	}

	@Override
	public double withdraw(long accountId, double amount) throws LowBalanceException {
		double balance = bankAccountDao.getbalance(accountId);
		if (balance - amount >= 0) {
			balance = balance - amount;
			bankAccountDao.updateBalance(accountId, balance);
			return balance;
		} else
			throw new LowBalanceException("You don't have sufficient fund...");
	}

	@Override
	public double deposit(long accountId, double amount) {
		double balance = bankAccountDao.getbalance(accountId);
		balance = balance + amount;
		bankAccountDao.updateBalance(accountId, balance);
		return balance;
	}

	@Override
	public boolean deleteBankAccount(long accountId) {
		return bankAccountDao.deletebankAccount(accountId);
	}

	@Override
	public double fundTransfer(long fromAccount, long toAccount, double amount) throws LowBalanceException {
		double newBalance = withdraw(fromAccount, amount);
		deposit(toAccount, amount);
		return newBalance;
	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {

		return bankAccountDao.addNewBankAccount1(account);
	}

	

	public static void updateBalance(double accountId, double balance) {
		

	}

	@Override
	public void searchBankAccount() {
	
	}

	@Override
	public void searchBankAccount(Long accountId) {
		

	}

	@Override
	public List<BankAccount> findAllBankAccounts() {
		
		return bankAccountDao.findAllBankAccounts();
	}

}

