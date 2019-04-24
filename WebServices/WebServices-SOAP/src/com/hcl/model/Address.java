package com.hcl.model;

public class Address {

	private String streetName;
	private int number;
	private int zipCode;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", number=" + number + ", zipCode=" + zipCode + "]";
	}
	public Address(String streetName, int number, int zipCode) {
		super();
		this.streetName = streetName;
		this.number = number;
		this.zipCode = zipCode;
	}
	
	
	
}
