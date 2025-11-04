package org.example.exceptions;

public class OkladException extends Exception {
	private final double invalidOklad;

	public OkladException(String message, double invalidOklad) {
		super(message);
		this.invalidOklad = invalidOklad;
	}

	public double getInvalidOklad() {
		return invalidOklad;
	}
}


