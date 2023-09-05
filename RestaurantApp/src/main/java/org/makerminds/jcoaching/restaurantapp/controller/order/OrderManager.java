package org.makerminds.jcoaching.restaurantapp.controller.order;

import static org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize.LARGE;
import static org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize.MEDIUM;
import static org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize.SMALL;
import static org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize.XXL;

import java.util.ArrayList;
import java.util.HashMap;

import org.makerminds.jcoaching.restaurantapp.model.Menu;
import org.makerminds.jcoaching.restaurantapp.model.order.Order;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItem;
import org.makerminds.jcoaching.restaurantapp.model.order.OrderItemSize;
import org.makerminds.jcoaching.restaurantapp.model.product.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderManager {
	private Order[] orderArray = new Order[10];

	public Order createOrder(Menu menu) {
		Order order = new Order(321);
		ArrayList<OrderItem> orderitems = order.getOrderItems();
		HashMap<Integer, Product> menuItems = menu.getMenuItems();
		addOrderItem(order, menuItems.get(100), 2, LARGE);
		addOrderItem(order, menuItems.get(101), 1, MEDIUM);
		addOrderItem(order, menuItems.get(200), 2, SMALL);
		addOrderItem(order, menuItems.get(201), 2, XXL);
		return order;
	}

	private void addOrderItem(Order order, Product product, int quantity, OrderItemSize orderItemSize) {
		OrderItem orderItem = new OrderItem(product, quantity, orderItemSize);
		order.getOrderItems().add(orderItem);
	}

	public void addOrder(Order order) {
		for (int i = 0; i < orderArray.length; i++) {
			if (orderArray[i] == null) {
				orderArray[i] = order;
				break;
			}
		}
	}
}