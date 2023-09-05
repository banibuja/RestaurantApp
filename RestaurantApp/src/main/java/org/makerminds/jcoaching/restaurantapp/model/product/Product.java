package org.makerminds.jcoaching.restaurantapp.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
	private int productId;
	private String name;
	private double price;
}