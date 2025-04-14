package com.freightdelivery.models;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String name;
	private String email;
	private long phone;
	private String companyName;
	private String address;
	private Date createdAt;
	private Date updatedAt;
	
	@OneToMany(mappedBy = "fk_customerId", cascade = CascadeType.ALL)
    
	private List<Shipment> shipment;
}
