package com.freightdelivery.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightdelivery.models.Carrier;
import com.freightdelivery.repositories.CarrierRepository;

import lombok.Data;

@Service

public class CarrierServiceImpl  implements CarrierService{
	@Autowired
	 CarrierRepository cr;
	
	
	public Carrier saveCarrierDetails(Carrier carrier) {
		return cr.save(carrier);
	}
	
	
	public List<Carrier> getAllCarrier(){
		return cr.findAll();
		
	}
	
	
	public void deleteCarrier(int carrierId) {
		cr.deleteById(carrierId);
		
	}
	
	
	public Carrier updateCarrier(int carrierId, Carrier carrier) {
		
		Carrier car = cr.findById(carrierId).orElse(null);
		car.setName(carrier.getName());
		car.setEmail(carrier.getEmail());
		car.setPhone(carrier.getPhone());
		car.setCapacity(carrier.getCapacity());
		car.setActive(carrier.isActive());
  
		return cr.save(car);
	}

}
