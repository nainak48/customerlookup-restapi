package com.nk.repository;

import org.springframework.data.repository.CrudRepository;

import com.nk.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
