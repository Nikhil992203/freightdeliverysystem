package com.freightdelivery.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.freightdelivery.controllers.CustomerController;
import com.freightdelivery.models.Customer;
import com.freightdelivery.repositories.FreightRepository;
import com.freightdelivery.services.CustomerService;

import lombok.Data;

@Service
@Data
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private final FreightRepository freightRepository;



@Override
public Customer saveCustomerDetails(Customer customer) {
	return freightRepository.save(customer);
}
   
    @Override
    public List<Customer> getAllCustomers() {
        return freightRepository.findAll();
    }

   

    @Override
    public void deleteCustomer(int customerId) {
    	freightRepository.deleteById(customerId);
    }

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		Customer csr=freightRepository.findById(customerId).orElse(null);
		csr.setName(customer.getName());
		csr.setAddress(customer.getAddress());
		csr.setCompanyName(customer.getCompanyName());
		csr.setEmail(customer.getEmail());
		csr.setPhone(customer.getPhone());

		return freightRepository.save(csr);
	}

	

	
}
