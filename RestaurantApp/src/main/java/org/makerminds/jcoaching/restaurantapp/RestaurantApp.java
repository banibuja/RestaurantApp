package org.makerminds.jcoaching.restaurantapp;

import java.util.Scanner;

import org.makerminds.jcoaching.restaurantapp.controller.LocationManager;
import org.makerminds.jcoaching.restaurantapp.controller.OrderPrinter;
import org.makerminds.jcoaching.restaurantapp.controller.order.OrderManager;
import org.makerminds.jcoaching.restaurantapp.controller.reservation.ReservationManager;
import org.makerminds.jcoaching.restaurantapp.model.ApplicationMode;
import org.makerminds.jcoaching.restaurantapp.model.Client;
import org.makerminds.jcoaching.restaurantapp.model.Location;
import org.makerminds.jcoaching.restaurantapp.model.Menu;
import org.makerminds.jcoaching.restaurantapp.model.Restaurant;
import org.makerminds.jcoaching.restaurantapp.model.Table;
import org.makerminds.jcoaching.restaurantapp.model.order.Order;
import org.makerminds.jcoaching.restaurantapp.model.product.Meal;
import org.makerminds.jcoaching.restaurantapp.model.product.Product;

public class RestaurantApp {
	private static Location currentLocation;

	public static void main(String[] args) {
//		String applicationMode = args[0]; // ORDER or TABLERESERVATION
//		String locationAsString = args[1];

		// get parameters from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select an application mode (type number):");
		System.out.println("1. " + ApplicationMode.ORDER.name());
		System.out.println("2. " + ApplicationMode.TABLERESERVATION.name());
		int selectedApplicationModeID = scanner.nextInt();
		ApplicationMode selectedApplicationMode = getApplicationModeFromId(selectedApplicationModeID);
		System.out.println("Please select your location (type number):");
		System.out.println("1. " + Location.KOSOVO.name());
		System.out.println("2. " + Location.GERMANY.name());
		int selectedLocationID = scanner.nextInt();
		scanner.close();

		currentLocation = LocationManager.getLocationFromString(selectedLocationID);
		validateApplicationMode(selectedApplicationMode);
	}

	private static ApplicationMode getApplicationModeFromId(int selectedApplicationModeID) {
		switch (selectedApplicationModeID) {
		case 1:
			return ApplicationMode.ORDER;
		case 2:
			return ApplicationMode.TABLERESERVATION;
		default:
			return null;
		}
	}

	private static void validateApplicationMode(ApplicationMode selectedApplicationMode) {
		switch (selectedApplicationMode) {
		case ORDER:
			runOrderProcess();
			break;
		case TABLERESERVATION:
			runTableReservationProcess();
			break;
		default:
//			System.err.println("No valid application mode selected.");
			throw new IllegalArgumentException("No valid application mode selected.");
		}
	}

	public void understandingPolymorphism() {
		Product productPoly = new Meal("Hamburger", 100, 4.5, "Nice Hamburger");
		productPoly.getName();
		productPoly.getProductId();
		productPoly.getPrice();
//		Meal mealPoly = (Meal) productPoly;
		((Meal) productPoly).getDescription();
	}

	private static void runOrderProcess() {
		OrderManager orderManager = new OrderManager();
		Restaurant restaurant1 = new Restaurant("Ora", "Rruga e Ores");
		Client client1 = new Client("Agon", "+38344123456");
		Menu menu = new Menu();
		Order order = orderManager.createOrder(menu);
		OrderPrinter orderPrinter = new OrderPrinter();
		orderManager.addOrder(order);
		orderPrinter.printInvoice(order, restaurant1, client1, currentLocation);
	}

	@SuppressWarnings("unused")
	private static void runTableReservationProcess() {
		ReservationManager reservationManager = new ReservationManager();
		Table table1 = new Table(1, 6, true);
//		reservationManager.reserveTable(restaurant1, table1, client1);

	}
}