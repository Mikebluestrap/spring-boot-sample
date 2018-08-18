package com.spring.services;

import java.util.List;

import com.spring.entities.Account;

public interface AccountDetailsService {

	/**
	 * Returns the list of Account information
	 * 
	 * @return
	 */
	List<Account> getAccountList();

	/**
	 * Returns the Account information by accountId.
	 * 
	 * @param accountId
	 * @return
	 */
	Account getAccountById(long accountId);

	/**
	 * Returns the Account information by accountId and routingNumber.
	 * 
	 * @param accountId
	 * @param routingNumber
	 * @return
	 */
	Account getAccountByIdAndRoutingNumber(long accountId, long routingNumber);

	/**
	 * Save the Account information
	 * 
	 * @param account
	 * @return
	 */
	Account saveAccount(Account account);
}
