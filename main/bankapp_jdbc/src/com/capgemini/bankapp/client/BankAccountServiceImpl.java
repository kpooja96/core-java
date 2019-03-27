package com.capgemini.bankapp.client;

import java.util.List;

import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {

	@Override
	public double withdraw(long accountId, double amount) throws LowBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deposit(long accountId, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteBankAccount(long accountId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double fundTransfer(long fromAccount, long toAccount, double amount) throws LowBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double checkBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void searchBankAccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BankAccount> findAllBankAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void searchBankAccount(Long accountId) {
		// TODO Auto-generated method stub

	}

}
