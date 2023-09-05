package org.makerminds.jcoaching.restaurantapp.controller.order;

import org.makerminds.jcoaching.restaurantapp.InvalidOrderItemSizeException;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize;

public class OrderCalculatorGER extends AbstractOrderCalculator {
	@Override
	public double getSizeRateAmount(OrderItemSize orderItemSize) {
		switch (orderItemSize) {
		case SMALL:
			return 0.8;
		case MEDIUM:
			return 1;
		case LARGE:
			return 1.25;
		case XXL:
			return 1.3;
		default:
			throw new InvalidOrderItemSizeException("No valid order item size: " + orderItemSize);
		}
	}

	@Override
	protected double getVATRate() {
		return 0.19;
	}
}