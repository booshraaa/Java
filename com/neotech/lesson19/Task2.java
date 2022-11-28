package com.neotech.lesson19;

public class Task2 {
//	Create a method that will take a String as a
//	parameter and returns reversed String. Method
//	should be available to all classes within your project
//	and accessible by class name.
	// method
	// parameter string str
	// public access modifier
	// static
	// reverse string

	public static String reverse(String str) {

		String reversed = "man what the hell is this";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

}
