package org.makerminds.jcoaching.restaurantapp.model.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Product {
	private boolean sugarFree;

	public Drink(String name, int productId, double price, boolean sugarFree) {
		super(productId, name, price);
		this.sugarFree = sugarFree;
	}
}