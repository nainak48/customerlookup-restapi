package com.nk.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nk.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

	List<Account> findByCustomerCustomerId(Integer customerId);

}
