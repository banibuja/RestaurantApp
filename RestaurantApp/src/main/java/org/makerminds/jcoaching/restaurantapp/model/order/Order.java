package org.makerminds.jcoaching.restaurantapp.model.order;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

public class Order {
	@Getter
	@Setter
	private int orderNr;
	@Getter
	private ArrayList<OrderItem> orderItems = new ArrayList<>();

	public Order(int orderNr) {
		this.orderNr = orderNr;
	}
}
