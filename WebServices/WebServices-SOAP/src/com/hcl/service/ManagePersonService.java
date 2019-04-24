package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.hcl.model.Address;
import com.hcl.model.Person;

@WebService
public class ManagePersonService {

	List<Person> personList = new ArrayList<>();
	
	
	@WebResult(name="Person")
	@WebMethod()
	public List<Person> getAllPerson(){
		return personList;
	}
	
	@WebResult(name="PersonBid")
	@WebMethod()
	public Person getPersonById(@WebParam(name="id")int id) {
		return personList.stream()
				.filter(p->p.getId()==id)
				.findAny()
				.orElse(new Person());
	}
	
	@WebMethod()
	
	public boolean deletePerson(int id) {
		if(personList.get(id) == null) return false;
		personList.remove(id);
		return true;
	}
	
	
	@WebMethod(exclude=true)
	@PostConstruct
	public void init() {
		Person person1 = new Person(1, "Oscar", "Hernandez", 31, new Address("Vista", 21, 45130));
		Person person2 = new Person(2, "Andres", "Lopez", 21, new Address("Centinela", 821, 4500));
		Person person3 = new Person(3, "Miguel", "Zepeda", 15, new Address("Linda Vista", 213, 45150));
		Person person4 = new Person(4, "Juan", "Perez", 33, new Address("Agronomos", 45, 45120));
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
	}
	
}
