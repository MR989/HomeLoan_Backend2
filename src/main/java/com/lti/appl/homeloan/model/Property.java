package com.lti.appl.homeloan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "PROPERTY")

public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PROPERTYID")
	@PrimaryKeyJoinColumn
	private int propertyId;

	@Column(name="PROPERTYLOCATION")
	private String propertyLocation;
	
	@Column(name="PROPERTYNAME")
	private String propertyName;
	
	@Column(name="PROPERTYCOST")
	private int propertyCost;
	
	@ManyToOne
	@JoinColumn(name="DEBTORID")
	private Debtor debtors2;

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public int getPropertyCost() {
		return propertyCost;
	}

	public void setPropertyCost(int propertyCost) {
		this.propertyCost = propertyCost;
	}
	@JsonIgnore
	public Debtor getDebtors2() {
		return debtors2;
	}

	public void setDebtors2(Debtor debtors2) {
		this.debtors2 = debtors2;
	}

	public Property(int propertyId, String propertyLocation, String propertyName, int propertyCost, Debtor debtors2) {
		super();
		this.propertyId = propertyId;
		this.propertyLocation = propertyLocation;
		this.propertyName = propertyName;
		this.propertyCost = propertyCost;
		this.debtors2 = debtors2;
	}

	public Property(int propertyId, String propertyLocation, String propertyName, int propertyCost) {
		super();
		this.propertyId = propertyId;
		this.propertyLocation = propertyLocation;
		this.propertyName = propertyName;
		this.propertyCost = propertyCost;
	}

	public Property(String propertyLocation, String propertyName, int propertyCost, Debtor debtors2) {
		super();
		this.propertyLocation = propertyLocation;
		this.propertyName = propertyName;
		this.propertyCost = propertyCost;
		this.debtors2 = debtors2;
	}

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

}
