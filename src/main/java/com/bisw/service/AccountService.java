package com.bisw.service;

import java.util.List;

import com.bisw.entity.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public Account getaccountDetailsByAccountNumber(Long accountNumber);
	public List<Account> getAccountdetails();
	public Account depositAmount(Long accountNumber,Double amount);
	public Account withdrawAmount(Long accountNumber,double amount);
	public void closeAccount(Long accountnumber);
}
