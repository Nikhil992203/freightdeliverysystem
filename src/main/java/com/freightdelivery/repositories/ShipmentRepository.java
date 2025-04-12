package com.freightdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freightdelivery.models.Shipment;
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer>{

}
