package com.freightdelivery.services;

import java.util.List;
import com.freightdelivery.models.Customer;

public interface CustomerService {

  public Customer saveCustomerDetails(Customer customer);

   public List<Customer> getAllCustomers();

   public Customer updateCustomer(int customerId, Customer customer);

   public void deleteCustomer(int customerId);
}
