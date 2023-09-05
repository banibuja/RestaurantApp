package org.makerminds.jcoaching.restaurantapp.model.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meal extends Product {
	private String description;

	public Meal(String name, int productId, double price, String description) {
		super(productId, name, price);
		this.description = description;
	}

	public Meal(String name, int productId, double price) {
		super(productId, name, price);
	}
}