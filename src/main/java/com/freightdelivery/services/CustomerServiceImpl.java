package com.freightdelivery.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.freightdelivery.controllers.CustomerController;
import com.freightdelivery.models.Customer;
import com.freightdelivery.repositories.CustomerRepository;
import com.freightdelivery.services.CustomerService;

import lombok.Data;

@Service
@Data
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private final CustomerRepository cr;

	@Override
	public Customer saveCustomerDetails(Customer customer) {
		return cr.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return cr.findAll();
	}

	@Override
	public void deleteCustomer(int customerId) {
		cr.deleteById(customerId);
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {

		Customer csr = cr.findById(customerId).orElse(null);
		csr.setName(customer.getName());
		csr.setAddress(customer.getAddress());
		csr.setCompanyName(customer.getCompanyName());
		csr.setEmail(customer.getEmail());
		csr.setPhone(customer.getPhone());
		csr.setCreatedAt(customer.getCreatedAt());
		csr.setUpdatedAt(customer.getUpdatedAt());

		return cr.save(csr);
	}

}
