package com.nk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.model.Customer;
import com.nk.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Customer getCustomerById(Integer id) {
		return customerRepository.findOne(id);
	}

	public void addOrUpdateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(Integer id) {
		customerRepository.delete(id);
	}

}
