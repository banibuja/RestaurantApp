package org.makerminds.jcoaching.restaurantapp.controller.order;

import org.makerminds.jcoaching.restaurantapp.InvalidOrderItemSizeException;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize;

public class OrderCalculatorKS extends AbstractOrderCalculator {
	@Override
	public double getSizeRateAmount(OrderItemSize orderItemSize) {
		switch (orderItemSize) {
		case SMALL:
			return 0.7;
		case MEDIUM:
			return 1;
		case LARGE:
			return 1.2;
		case XXL:
			return 1.25;
		default:
			throw new InvalidOrderItemSizeException("No valid order item size: " + orderItemSize);
		}
	}

	@Override
	public double getVATRate() {
		return 0.18;
	}
}