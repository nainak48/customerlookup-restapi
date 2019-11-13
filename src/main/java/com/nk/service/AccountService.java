package com.nk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.exception.ResourceNotFoundException;
import com.nk.model.Account;
import com.nk.model.Customer;
import com.nk.repository.AccountRepository;
import com.nk.repository.CustomerRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private CustomerRepository customerRepository;

	public List<Account> getAllAccounts(Integer customerId) {
		return accountRepository.findByCustomerCustomerId(customerId);
	}

	public Account getAccount(Integer accountId) {
		return accountRepository.findOne(accountId);
	}

	public void addOrUpdateAccount(Account account, Integer customerId) {
		if (!customerRepository.exists(customerId)) {
			new ResourceNotFoundException("Customer [customerId=" + customerId + "] can't be found");
		}

		Customer customer = customerRepository.findOne(customerId);
		account.setCustomer(customer);
		accountRepository.save(account);
	}

	public void deleteAccount(Integer customerId, Integer accountId) {
		if (!customerRepository.exists(customerId)) {
			throw new ResourceNotFoundException("Customer [customerId=" + customerId + "] can't be found");
		}
		accountRepository.delete(accountId);
	}

}
