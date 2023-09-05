package org.makerminds.jcoaching.restaurantapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Table {
	private int tableNr;
	private int seats;
	private boolean free;
}
