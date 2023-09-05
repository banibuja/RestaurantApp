package org.makerminds.jcoaching.restaurantapp;

@SuppressWarnings("serial")
public class InvalidOrderItemSizeException extends RuntimeException {
	public InvalidOrderItemSizeException(String message) {
		super(message);
	}
}