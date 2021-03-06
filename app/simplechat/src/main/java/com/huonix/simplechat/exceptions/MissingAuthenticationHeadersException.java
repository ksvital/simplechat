package com.huonix.simplechat.exceptions;

/**
 * 
 * @author Kepler Vital
 *
 */
public class MissingAuthenticationHeadersException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public MissingAuthenticationHeadersException() {
		super();
	}
	
	public MissingAuthenticationHeadersException(String message) {
		super(message);
	}
	
}
