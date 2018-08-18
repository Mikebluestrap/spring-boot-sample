package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Account;
import com.spring.services.AccountDetailsService;

@RestController
@RequestMapping("/api")
public class AccountRestController {

	@Autowired
	AccountDetailsService accountService;	

	@GetMapping("/account")
	public Account getAccountDetails(@RequestParam("accountId") long accountId) {
		return accountService.getAccountById(accountId);
	}
	
	@GetMapping("/account/{accountId}/{routingNumber}")
	public Account getAccountDetailsByPathParam(@PathVariable("accountId") long accountId, @PathVariable("routingNumber") long routingNumber) {
		return accountService.getAccountById(accountId);
	}

	@GetMapping("/accounts")
	public List<Account> getAccountsList() {
		return accountService.getAccountList();
	}

	@PostMapping("/account")
	public Account submitAccount(@ModelAttribute("Account") Account account) {
		return accountService.saveAccount(account);
	}
}
