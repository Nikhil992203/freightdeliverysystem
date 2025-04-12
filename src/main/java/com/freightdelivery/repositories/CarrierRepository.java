package com.freightdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freightdelivery.models.Carrier;

@Repository
public interface CarrierRepository extends JpaRepository<Carrier, Integer> {

}
