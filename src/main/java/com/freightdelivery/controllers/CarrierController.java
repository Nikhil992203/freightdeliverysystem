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

import com.freightdelivery.models.Carrier;
import com.freightdelivery.services.CarrierService;

@RestController
@RequestMapping("/carrier")
public class CarrierController {
@Autowired
	 CarrierService cc;
	@PostMapping("/post")
	public Carrier addCarrier(@RequestBody Carrier carrier) {
		return cc.saveCarrierDetails(carrier);
		
	}
	
	@GetMapping("/get")
	public List<Carrier> getCarrier(){
		return cc.getAllCarrier();
	}
	
	@DeleteMapping("/delete/{cid}")
	public void deleteCarrier(@PathVariable int cid) {
		cc.deleteCarrier(cid);
	}
	@PutMapping("/update/{cid}")
	public Carrier update(@PathVariable int cid, @RequestBody Carrier carrier) {
	Carrier cr=	cc.updateCarrier(cid, carrier);
	return cr;
	}
}
