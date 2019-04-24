package com.hcl.model;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", address=" + address + "]";
	}
	public Person(int id, String firstName, String lastName, int age, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	public Person() {
	}
	
	
	
	
}
