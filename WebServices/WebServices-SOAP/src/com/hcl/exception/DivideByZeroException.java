package com.hcl.exception;

public class DivideByZeroException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivideByZeroException(String message) {
		super("You must not divide by zero");
	}

}
