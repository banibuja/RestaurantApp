package org.makerminds.jcoaching.restaurantapp.model.order;

import org.makerminds.jcoaching.restaurantapp.model.product.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
	private Product product;
	private int quantity;
	private double orderItemPrice;
	private OrderItemSize orderItemSize;

	public OrderItem(Product product, int quantity, OrderItemSize orderItemSize) {
		this.product = product;
		this.quantity = quantity;
		this.orderItemSize = orderItemSize;
	}
}
