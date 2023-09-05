package org.makerminds.jcoaching.restaurantapp;

public class Order {
	private Product product1;
	private Product product2;
	private Product product3;
	private Product product4;
	
	public Order(Product product1, Product product2, Product product3, Product product4) {
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.product4 = product4;


	}
	
	
	public Product getProduct1() {
		return product1;
	}
	public void setProduct1(Product product1) {
		this.product1 = product1;
	}
	public Product getProduct2() {
		return product2;
	}
	public void setProduct2(Product product2) {
		this.product2 = product2;
	}
	public Product getProduct3() {
		return product3;
	}
	public void setProduct3(Product product3) {
		this.product3 = product3;
	}
	public Product getProduct4() {
		return product4;
	}
	public void setProduct4(Product product4) {
		this.product4 = product4;
	}
	
	
	
	
	
	
	
	

	

}
