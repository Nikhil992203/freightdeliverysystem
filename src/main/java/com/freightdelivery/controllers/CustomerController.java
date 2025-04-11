package com.freightdelivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freightdelivery.models.Customer;
import com.freightdelivery.services.CustomerService;

import lombok.Data;

@RestController
@Data
public class CustomerController {
	
	@Autowired
    CustomerService cs;
	
	@PostMapping("/post")
	public Customer addCustomer(@RequestBody Customer customer) {
		return cs.saveCustomerDetails(customer);
	}
	
	@GetMapping("/get")
	public List<Customer> getAllCustomer(){
		return cs.getAllCustomers();
	}
	
	@DeleteMapping("/delete")
	public void deletcustomer(@PathVariable int id) {
		cs.deleteCustomer(id);
	}
	@PutMapping("/update/{id}")
	public Customer updateCustomer(@PathVariable int id,@RequestBody Customer customerdet) {
		Customer csr=cs.updateCustomer(id, customerdet);
		return csr;
		
	}
}
