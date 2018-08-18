package com.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.Account;
import com.spring.repositories.AccountRepository;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {

	@Autowired
	AccountRepository accountRepo;

	@Override
	public List<Account> getAccountList() {
		return accountRepo.findAll();
	}

	@Override
	public Account getAccountById(long accountId) {
		return accountRepo.findById(accountId).orElse(new Account());
	}

	@Override
	public Account getAccountByIdAndRoutingNumber(long accountId, long routingNumber) {
		return accountRepo.findByAccountNumberAndRoutingNumber(accountId, routingNumber);
	}

	@Override
	public Account saveAccount(Account account) {
		return accountRepo.save(account);
	}

}
