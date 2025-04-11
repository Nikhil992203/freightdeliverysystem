package com.freightdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freightdelivery.models.Customer;

@Repository
public interface FreightRepository extends JpaRepository<Customer, Integer>{

}
