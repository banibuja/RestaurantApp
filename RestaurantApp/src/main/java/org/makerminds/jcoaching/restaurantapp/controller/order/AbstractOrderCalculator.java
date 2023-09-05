package org.makerminds.jcoaching.restaurantapp.controller.order;

import java.util.ArrayList;

import org.makerminds.jcoaching.restaurantapp.InvalidOrderItemSizeException;
import org.makerminds.jcoaching.restaurantapp.controller.IOrderCalculator;
import org.makerminds.jcoaching.restaurantapp.model.order.Order;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItem;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize;
import org.makerminds.jcoaching.restaurantapp.model.product.Product;

public abstract class AbstractOrderCalculator implements IOrderCalculator {
	@Override
	public double getVATRate(boolean decimal) {
		if (decimal) {
			return getVATRate();
		} else {
			return getVATRate() * 100;
		}
	}

	public double claculateTotalOrderAmount(Order order) {
		ArrayList<OrderItem> orderProducts = order.getOrderItems();
		double totalOrderAmount = 0.0;
		for (OrderItem orderItem : orderProducts) {
			totalOrderAmount += calculateOrderItemPrice(orderItem);
		}
		return totalOrderAmount;
	}

	public double calculateOrderItemPrice(OrderItem orderItem) {
		double sizeRateAmount;
		try {
			sizeRateAmount = getSizeRateAmount(orderItem.getOrderItemSize());
		} catch (InvalidOrderItemSizeException e) {
			System.out.println("No valid order item size for item " + orderItem.getProduct().getName()
					+ ". Default size" + " rate ammount (100%) will be applied.");
			sizeRateAmount = 1;
		}
		Product product = orderItem.getProduct();
		double totalOrderItemPriceSingle = product.getPrice() * sizeRateAmount;
		orderItem.setOrderItemPrice(totalOrderItemPriceSingle);
		return totalOrderItemPriceSingle * orderItem.getQuantity();
	}

	@Override
	public double calculateTotalOrderAmountVAT(double totalOrderAmount) {
		return totalOrderAmount * getVATRate();
	}

	protected abstract double getVATRate();

	protected abstract double getSizeRateAmount(OrderItemSize orderItemSize);
}