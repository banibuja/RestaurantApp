package org.makerminds.jcoaching.restaurantapp.controller;

import java.util.ArrayList;

import org.makerminds.jcoaching.restaurantapp.controller.order.AbstractOrderCalculator;
import org.makerminds.jcoaching.restaurantapp.controller.order.OrderCalculatorGER;
import org.makerminds.jcoaching.restaurantapp.controller.order.OrderCalculatorKS;
import org.makerminds.jcoaching.restaurantapp.model.Client;
import org.makerminds.jcoaching.restaurantapp.model.Location;
import org.makerminds.jcoaching.restaurantapp.model.Restaurant;
import org.makerminds.jcoaching.restaurantapp.model.order.Order;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItem;
import org.makerminds.jcoaching.restaurantapp.model.product.Product;

public class OrderPrinter {
	public void printInvoice(Order order, Restaurant restaurant, Client client, Location location) {
		AbstractOrderCalculator orderCalculator = getOrderCalculator(location);
		double totalOrderAmount = orderCalculator.claculateTotalOrderAmount(order);
		double totalOrderAmountVAT = orderCalculator.calculateTotalOrderAmountVAT(totalOrderAmount);
		double totalOrderAmountWithVAT = totalOrderAmount + totalOrderAmountVAT;
		ArrayList<OrderItem> orderItems = order.getOrderItems();
		System.out.println("Order from " + client.getName() + ": ");
		System.out.println("----------------------------------------");
		for (OrderItem orderItem : orderItems) {
			Product product = orderItem.getProduct();
			double totalOrderItemPrice = orderItem.getOrderItemPrice() * orderItem.getQuantity();
			System.out.println(orderItem.getQuantity() + "x | " + product.getName() + " | "
					+ orderItem.getOrderItemPrice() + "$ | " + totalOrderItemPrice + "$ | ");
		}
		System.out.println("----------------------------------------");
		System.out.println("The total price of the order is: ");
		System.out.println("SUB TOTAL: " + totalOrderAmount + "$ ");
		int vatRate = (int) orderCalculator.getVATRate(false);
		System.out.println("VAT " + vatRate + "%: " + totalOrderAmountVAT + "$ ");
		System.out.println("TOTAL: " + totalOrderAmountWithVAT + "$");
		System.out.println("----------------------------------------");
		System.out.println("Restaurant " + restaurant.getName() + " in " + restaurant.getAddress());
	}

	private AbstractOrderCalculator getOrderCalculator(Location location) {
		switch (location) {
		case KOSOVO:
			return new OrderCalculatorKS();
		case GERMANY:
			return new OrderCalculatorGER();
		default:
			System.err.println("Current location is invalid");
			return null;
		}
	}
}