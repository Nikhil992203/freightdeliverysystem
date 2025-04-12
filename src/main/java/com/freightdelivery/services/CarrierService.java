package com.freightdelivery.services;

import java.util.List;

import com.freightdelivery.models.Carrier;

public interface CarrierService {
	public Carrier saveCarrierDetails(Carrier carrier);

	public void deleteCarrier(int carrierId);
	public List<Carrier> getAllCarrier();
	public Carrier updateCarrier(int carrierId, Carrier carrier);
	
	
	
	
}
