package com.freightdelivery.models;



import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Shipment {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int shipmentId;

@ManyToOne
@JoinColumn(name="fk_customerId") 
	private Customer fk_customerId;
	@ManyToOne
	@JoinColumn(name="fk_carrier_id" )
	private Carrier fk_carrier_id;
	private String origin;
	private String destination;
	private double packageWeight;
	private LocalDate deliveryDate;
	private String invoiceFilePath;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private OrderStatus orderStatus;
    public enum OrderStatus {
	        CREATED,
	        IN_TRANSIT,
	        DELIVERED,
	        CANCELLED
	    }
	
}





