package com.nk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nk.model.Customer;
import com.nk.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomers();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/customer/{customerId}")
	public Customer getCustomerById(@PathVariable Integer customerId) {
		return customerService.getCustomerById(customerId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addOrUpdateCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/customer/{customerId}")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.addOrUpdateCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customer/{customerId}")
	public void deleteCustomer(@PathVariable Integer customerId) {
		customerService.deleteCustomer(customerId);
	}

}