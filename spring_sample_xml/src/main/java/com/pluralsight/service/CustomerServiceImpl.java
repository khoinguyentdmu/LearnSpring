package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setFoo(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	public CustomerServiceImpl() {
	}
}
