package com.hcl.publisher;

import javax.xml.ws.Endpoint;

import com.hcl.service.CalculatorWS;

public class CalcPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9090/calculator", new CalculatorWS());
		System.out.println("up and running...");
	}
	
}
