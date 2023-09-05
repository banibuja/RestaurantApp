package org.makerminds.jcoaching.restaurantapp.controller.reservation;

import org.makerminds.jcoaching.restaurantapp.model.Client;
import org.makerminds.jcoaching.restaurantapp.model.Restaurant;
import org.makerminds.jcoaching.restaurantapp.model.Table;

/**
 * makes a reservation for the specified restaurant, table and client
 * 
 * @param restaurant
 * @param table
 * @param client
 */
public class ReservationManager {
	public void reserveTable(Restaurant restaurant, Table table, Client client) {
		System.out.println("Starting reservation service...");
		System.out.println("Preparing reservation");
		System.out.println("Check table with table number " + table.getTableNr() + ", is free: " + table.isFree());
		System.out.println("Client " + client.getName() + " has reserved the table with table number "
				+ table.getTableNr() + " at the restaurant " + restaurant.getName());
		System.out.println("Reservation service completed...");
		System.out.println("Stopping reservation service");
	}
}