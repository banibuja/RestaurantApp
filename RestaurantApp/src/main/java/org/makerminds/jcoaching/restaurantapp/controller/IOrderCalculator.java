package org.makerminds.jcoaching.restaurantapp.controller;

import org.makerminds.jcoaching.restaurantapp.model.order.Order;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItem;

public interface IOrderCalculator {
	public double calculateTotalOrderAmount(Order order);

	public double calculateOrderItemPrice(OrderItem orderItem);

	public double calculateTotalOrderAmountVAT(double totalOrderAmount);

	public double getVATRate(boolean decimal);
}