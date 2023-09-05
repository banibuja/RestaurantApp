package org.makerminds.jcoaching.restaurantapp;

public class OrderPrinter {
	
	public  void printOrderInfo(Customer customer, Restaurant restaurant, Order order) {
		System.out.println("The customer " + customer.getName() + " placed in the Restaurant " + restaurant.getName() + " than following order:");
		System.out.println("Product 1: " + order.getProduct1().getName());
		System.out.println("Product 2: " + order.getProduct2().getName());
		System.out.println("Product 3: " + order.getProduct3().getName());
		System.out.println("Product 4: " + order.getProduct4().getName());
		
		
		
	}

}
