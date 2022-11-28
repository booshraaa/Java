package com.neotech.lesson29;

import java.util.ArrayList;

public class Homework1 {
	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("milk");
		drinks.add("coffee");
		drinks.add("whiskey");
		drinks.add("tea");
		drinks.add("soda");
		drinks.add(1, "water");
		drinks.add("coffee");

		// for each
		for (String drink : drinks) {
			if (drink.contains("a") || drink.contains("e")) {
				drink = drink.replaceAll(drink, "water");
			}
			System.out.print(drink + " ");
		}
		System.out.println();
		System.out.println(drinks);

		// normal for loop
		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("a")) {

			}
		}

	}

}
