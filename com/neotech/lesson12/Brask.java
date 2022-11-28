package com.neotech.lesson12;

public class Brask {
	public static void main(String[] args) {
		// create an array of countries
		// while retrieving all values from an array, print
		// the capital for each country
		// use 2 different loops

		String[] countries = { "U.S", "Turkey", "Mars" };
		// 1st way
		for (int i = 0; i < countries.length; i++) {
			String country = countries[i];
			if (country.equals(countries[0])) {
				System.out.println("OHIO");
			} else if (country.equals(countries[1])) {
				System.out.println("Ankara");
			} else if (country.equals(countries[2])) {
				System.out.println("kars");
			} else {
				System.out.println(" ");
			}
		}
		System.out.println("-------------");

		// 2nd way
		for (String country : countries) {
			if (country.equals("U.S")) {
				System.out.println("Ohio");
			} else if (country.equals(countries[1])) {
				System.out.println("Ankara");
			} else if (country.equals(countries[2])) {
				System.out.println("kars");
			} else {
				System.out.println(" ");
			}
		}

	}

}
