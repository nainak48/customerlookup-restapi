package com.nk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nk.model.Account;
import com.nk.model.Customer;
import com.nk.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountservice;

	/* Fetch all the accounts for customer */
	@RequestMapping("/customer/{customerId}/accounts")
	public List<Account> getAllAccounts(@PathVariable Integer customerId) {
		return accountservice.getAllAccounts(customerId);
	}

	/* Fetch account details based on accountId associated to customer */
	@RequestMapping(method = RequestMethod.GET, value = "/customer/{customerId}/account/{accountId}")
	public Account getAccountById(@PathVariable Integer accountId) {
		return accountservice.getAccount(accountId);
	}

	/* Add an account for customer */
	@RequestMapping(method = RequestMethod.POST, value = "/customer/{customerId}/accounts")
	public void addAccount(@RequestBody Account account, @PathVariable Integer customerId) {
		account.setCustomer(new Customer(customerId, "", "", null));
		accountservice.addOrUpdateAccount(account, customerId);
	}

	/* Update the account details */
	@RequestMapping(method = RequestMethod.PUT, value = "/customer/{customerId}/account/{accountId}")
	public void updateAccount(@RequestBody Account account, @PathVariable Integer customerId) {
		accountservice.addOrUpdateAccount(account, customerId);
	}

	/* delete the account for customer */
	@RequestMapping(method = RequestMethod.DELETE, value = "/customer/{customerId}/account/{accountId}")
	public void deleteAccount(@PathVariable Integer customerId, @PathVariable Integer accountId) {
		accountservice.deleteAccount(customerId, accountId);
	}

}