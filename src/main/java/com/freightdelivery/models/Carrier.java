package com.freightdelivery.models;

import org.springframework.beans.factory.annotation.Value;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Carrier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carrierId;
	private String name;
	private long phone;
	private String email;
	private int capacity;
	private boolean active;
	
//	@OneToMany(mappedBy = "carrier", cascade = CascadeType.ALL)
//	private Shipment shipment;
	
	
	

}
