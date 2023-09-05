package org.makerminds.jcoaching.restaurantapp;

public class Product {
	private int productId;
	private String name;
	private double price;
	
	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double Price) {
		this.price = price;
	}

}
