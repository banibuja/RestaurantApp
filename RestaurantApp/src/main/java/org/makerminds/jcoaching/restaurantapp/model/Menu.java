package org.makerminds.jcoaching.restaurantapp.model;

import java.util.HashMap;

import org.makerminds.jcoaching.restaurantapp.model.product.Drink;
import org.makerminds.jcoaching.restaurantapp.model.product.Meal;
import org.makerminds.jcoaching.restaurantapp.model.product.Product;

import lombok.Getter;

@Getter
public class Menu {
	private HashMap<Integer, Product> menuItems = new HashMap<>();

	public Menu() {
		initializeMenu();
	}

	public void initializeMenu() {
		menuItems.put(100, new Meal("Hamburger", 100, 4.5, "Angus beef patty, tomato, red onion"));
		menuItems.put(101, new Meal("Cheeseburger", 101, 5, "Angus beef patty, cheese, tomato, red onion"));
		menuItems.put(102, new Meal("Sandwich", 102, 3.5, "Chicken, mayonnaise, peppers"));
		menuItems.put(103, new Meal("Hotdog", 103, 3, "Beef, mustard, ketchup, onion, cucumber"));
		menuItems.put(104, new Meal("Pizza", 104, 6, "Margarita, tomato sauce, mozarella"));
		menuItems.put(105, new Meal("Fries", 105, 2, "french fries with ketchup and mayonnaise"));
		menuItems.put(200, new Drink("CocaCola", 200, 1, false));
		menuItems.put(201, new Drink("CocaCola Zero", 201, 1, true));
		menuItems.put(202, new Drink("Fanta", 201, 1, false));
		menuItems.put(203, new Drink("Sprite", 203, 1, false));
		menuItems.put(204, new Drink("Red Bull", 204, 2, false));
		menuItems.put(205, new Drink("Coffee", 205, 0.5, false));
		menuItems.put(300, new Meal("Ice Cream", 300, 1));
		menuItems.put(301, new Meal("Waffle", 301, 1));
		menuItems.put(302, new Meal("Brownie", 302, 1));
	}

	public HashMap<Integer, Product> getMenuItems() {
		return menuItems;
	}

//	public void makeOrder() {
//		menuItems.get(0);
//		for(Product product : menuItems) {
//			if(product.getProductId() == 100) {
//				
//			}
//		}
//	}
}
