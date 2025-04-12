package com.freightdelivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.freightdelivery.FreightDeliveryManagementSystemApplication;
import com.freightdelivery.models.Shipment;
import com.freightdelivery.services.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    private final FreightDeliveryManagementSystemApplication freightDeliveryManagementSystemApplication;
	@Autowired
	private ShipmentService ss;

    ShipmentController(FreightDeliveryManagementSystemApplication freightDeliveryManagementSystemApplication) {
        this.freightDeliveryManagementSystemApplication = freightDeliveryManagementSystemApplication;
    }

	@PostMapping("/post")
	public Shipment addShipment( @RequestBody  Shipment shipment) {
		return ss.addShipment(shipment);
	}
	
	@GetMapping("/get")
	public List<Shipment> getShipment(){
		return ss.getAllShipment();
	}
	
	@DeleteMapping("/delete/{shipmentId}")
	public void delete(@PathVariable int shipmentId) {
		 ss.deleteShipment(shipmentId);
	}
	@PutMapping("/update/{shipmentId}")
	public Shipment updateShipment(@PathVariable int shipmentId,@RequestBody Shipment shipment) {
		Shipment s= ss.updateShipment(shipmentId, shipment);
		return s;
	}
	
}
