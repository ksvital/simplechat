package com.huonix.simplechat.exceptions;

/**
 * 
 * @author Kepler Vital
 *
 */
public class ChatCreationErrorException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ChatCreationErrorException() {
		super();
	}
	
	public ChatCreationErrorException(String message) {
		super(message);
	}
	
}
