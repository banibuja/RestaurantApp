package org.makerminds.jcoaching.restaurantapp;

public class RestaurantApp {
	
	public static void main(String []args) {
		
	
		
		Restaurant restaurant1 = new Restaurant ("Illyria Deluxe", " Rruga e Sallave");
		System.out.println("Restaurant 2 name: " + restaurant1.getName());
		System.out.println("Restaurant 2 adress: " + restaurant1.getAddress());

		
		Customer customer = new Customer("Filan Filani", "+3834322342");
		customer.setName("Filan Filani");
		customer.setPhoneNr("+383423423");
		
		
		Product product1 = new Product(1, "Hambuger", 1.5);
		Product product2 = new Product(2, "Sandwich", 1.3);
		Product product3 = new Product(100, "CocaCola", 0.70);
		Product product4 = new Product(101, "Fanta", 0.70);
		Order order = new Order(product1, product2, product3, product4);

		OrderPrinter orderPrinter = new OrderPrinter();
		
		
		
		orderPrinter.printOrderInfo(customer, restaurant1, order);
	
		
	}
	
	

}
