package com.huonix.simplechat.exceptions;

/**
 * 
 * @author Kepler Vital
 *
 */
public class ChatLeaveException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ChatLeaveException() {
		super();
	}
	
	public ChatLeaveException(String message) {
		super(message);
	}
	
}
