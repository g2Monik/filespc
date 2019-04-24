package com.hcl.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWebService {

	@WebMethod
	public String syaHello(String name) {
		return "Hello "+name;
	}
	
}
