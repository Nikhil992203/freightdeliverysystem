package com.freightdelivery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.freightdelivery.models.Shipment;
@Service
public interface ShipmentService {
	public Shipment addShipment(Shipment shipment);
	public List<Shipment> getAllShipment();
	public void deleteShipment(int shipmentId);
	public Shipment updateShipment(int shipmentId, Shipment st);
}
