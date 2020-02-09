package com.capgemini.airlinereservationsystem.exceptions;

public class InvalidEntryException extends RuntimeException {
	String msg = "You've pressed a wrong key!";

	public InvalidEntryException() {
		
	}

	public InvalidEntryException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
}
