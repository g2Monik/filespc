package com.hcl.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.hcl.exception.DivideByZeroException;

@WebService(serviceName="CalculadoraService",portName="CalculadoraPuerto",name="Calculadora")
@SOAPBinding(style=Style.DOCUMENT,use=Use.LITERAL)
public class CalculatorWS {

	@WebResult(name = "OperationResult")
	@WebMethod(operationName="Dividir")
	public int divide(@WebParam(name = "FirstNumber") int a, @WebParam(name = "SecondNumber") int b) throws DivideByZeroException {
		int result = 0;
		if (a == 0 || b == 0) {
			throw new DivideByZeroException("You must not divide by zero");
		} else {
			result = a / b;
		}

		return result;
	}

}
