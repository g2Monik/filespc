package com.hcl.publisher;

import javax.xml.ws.Endpoint;

import com.hcl.service.ManagePersonService;

public class Publisher {

	public static void main(String[] args) {
		String url = new String("http://localhost:9090/personService");
		Endpoint.publish(url, new ManagePersonService());
		System.out.println("Service is up");
	}

}
