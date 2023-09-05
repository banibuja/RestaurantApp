package org.makerminds.jcoaching.restaurantapp.controller.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItem;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize;
import org.makerminds.jcoaching.restaurantapp.model.product.Meal;
import org.makerminds.jcoaching.restaurantapp.model.product.Product;

public class OrderCalculatorKSTest {
	/*
	 * Writing Test Classes: 1. Step: Define the input(parameters) 2. Step: Define
	 * the output (results)
	 */

	OrderCalculatorKS orderCalculatorKS = new OrderCalculatorKS();

	@Test
	protected void testGetVATRate() {
//		running the method to test
		double vatRate = orderCalculatorKS.getVATRate();
		System.out.println("Vat Rate: " + vatRate);
//		validate the results
		Assertions.assertEquals(0.18, vatRate);
	}

	@Test
	public void testCalculateOrderItemPrice() {
		Product testProduct = new Meal("Test-Hamburger", 999, 4.99);
		OrderItem testOrderItem = new OrderItem(testProduct, 1, OrderItemSize.MEDIUM);
		double calculatedResult = orderCalculatorKS.calculateOrderItemPrice(testOrderItem);
		Assertions.assertEquals(4.99, calculatedResult);
	}

	@Test
	public void testCalculateTotalOrderAmount() {

	}
}