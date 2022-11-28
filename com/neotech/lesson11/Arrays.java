package com.neotech.lesson11;

public class Arrays {
	// Arrays
	public static void main(String[] args) {

		// 1st way
		// data type & identifier = value
		int num = 5;

		// 2nd way
		// initializing
		int num2;
		num2 = 5;

		// 1st way
		int[] array1 = new int[5];

		// 2nd way
		int[] array2;
		array2 = new int[5];

		// How to store values in arrays;
		// array1 [10] [15] [20] [25] [30]
		array1[0] = 10;
		array1[1] = 15;
		array1[2] = 20;
		array1[3] = 25;
		array1[4] = 30;

		// Reassigning
		array1[0] = 5;

		System.out.println(array1[2]);

		// String Arrays

		String[] stringArray = new String[4];
		stringArray[0] = "new york";
		stringArray[1] = "new jersey";
		stringArray[2] = "dubai";
		stringArray[3] = "hawaii";

		System.out.println("I live in " + stringArray[2]);

		char[] letters = new char[6];

		letters[3] = 'c';
		letters[5] = 'a';
		letters[0] = 'b';
		letters[1] = 'x';

		System.out.println("the letter at index 5 is: " + letters[5]);

		// Reassigning
		letters[5] = 'y';

		System.out.println("the letter at index 5 is: " + letters[5]);
		System.out.println(letters[4]);

	}

}
