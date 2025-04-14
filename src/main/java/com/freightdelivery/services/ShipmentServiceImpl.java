package com.freightdelivery.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightdelivery.models.Carrier;
import com.freightdelivery.models.Customer;
import com.freightdelivery.models.Shipment;
import com.freightdelivery.repositories.ShipmentRepository;

import lombok.Data;

@Service
public class ShipmentServiceImpl implements ShipmentService {
	@Autowired
	ShipmentRepository sr;

	public Shipment addShipment(Shipment shipment) {
		return sr.save(shipment);
	}

	public List<Shipment> getAllShipment() {
		return sr.findAll();
	}

	public void deleteShipment(int shipmentId) {
		sr.deleteById(shipmentId);
	}

	public Shipment updateShipment(int shipmentId, Shipment st) {
		Carrier c = new Carrier();
		Customer cs = new Customer();
		Shipment s = sr.findById(shipmentId).orElse(null);
		s.setDestination(st.getDestination());
		s.setInvoiceFilePath(st.getInvoiceFilePath());
		
		s.setFk_carrier_id(c);
		c.getShipment().add(s);

		s.setFk_customerId(cs);
		cs.getShipment().add(s);
		
		s.setOrigin(st.getOrigin());
		s.setCreatedAt(st.getCreatedAt());
		s.setDeliveryDate(st.getDeliveryDate());
		s.setOrderStatus(st.getOrderStatus());
		s.setUpdatedAt(st.getUpdatedAt());
		s.setPackageWeight(st.getPackageWeight());
		return sr.save(s);

	}
}
