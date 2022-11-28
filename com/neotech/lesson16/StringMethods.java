package com.neotech.lesson16;

public class StringMethods {
	public static void main(String[] args) {
		// 1st way
		String name = "urmom";

		// 2nd way
		String name2 = new String("huh");

		// LENGTH()
		int size = name.length();
		System.out.println("The size of the name is " + size);

		String school = "NeoTech";
		System.out.println("The size of the school name is " + school.length());

		String school2 = "   NeoTech";
		System.out.println("The size of the school is now " + school2.length() + " bc of the spaces");

		// toUpperCase() toLowerCase()
		String city = "New York";
		// new york
		String lowercaseCity = city.toLowerCase();
		System.out.println(lowercaseCity);

		// NEW YORK
		System.out.println(city.toUpperCase());

		// String itself doesn't change, so it stays as New York
		System.out.println(city);

		// re assigned
		city = "new York City";
		System.out.println(city);

		// CONCATENATING()
		String sentence = "The size of " + school + " is " + school.length();

		String name1 = "Baris";
		String lastName = "Yazar";

		String fullName = name1 + " " + lastName;
		String fullname2 = name1.concat(lastName);
		System.out.println("Full name is " + fullname2);

		String namee1 = name1 + " " + lastName;
		String namee1w = name1.concat(" ").concat(lastName);
		System.out.println(namee1w);

		// METHOD CHAINING
		String method = name1.concat(" ").concat(lastName).concat(" ").concat(city);
		System.out.println(method);

		// isEmpty()
		String a = " ";
		boolean b = a.isEmpty();
		System.out.println(b);

		// trim()
		String c = " I am    very skinny  !      ";
		System.out.println(c);
		System.out.println(c.trim());
		System.out.println("length of full sentence is " + c.length());
		// method chaining with trim() and length()
		System.out.println("length of trimmed sentence is " + c.trim().length());

		// this is an array property, not a method
		int[] num = { 4, 5, 6, 7 };
		int numsize = num.length;
		System.out.println(numsize);

		// this is a string method
		int sizeofstring = "Hello".length();
		System.out.println(sizeofstring);

	}

}
