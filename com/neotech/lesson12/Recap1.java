package com.neotech.lesson12;

public class Recap1 {
	public static void main(String[] args) {
		// basic integer array
		int[] grades = new int[5];
		// print the size of this array
		System.out.println("The size is: " + grades.length);
		System.out.println("the third element of the array is: " + grades[2]);

		grades[3] = 85;
		grades[1] = 90;
		grades[2] = 100;
		grades[0] = 93;
		grades[4] = 78;
		// grades[5] = 100; error

		// re-assigning
		grades[4] = 98;

		int size = grades.length;

		System.out.println("The size of the array after values is: " + size);
		System.out.println("the third element of the array is: " + grades[2]);

		int total = 0;
		// find the average of the array
//				int average = 0;
//				for (int j = 0; j < 5; j++) {
//					average += grades[j];
//				}
		int average = total / 5;
		System.out.println("The average is: " + average);

		// total of all elements using for loop
		for (int i = 0; i < 5; i++) {
			total += grades[i]; // sum = sum + grades(i)
		}
		System.out.println("The total is: " + total);

		System.out.println("------------------------");

		String[] cities = { "Rome", "New York", "Milan", "Paris", "Tokyo", "Dubai" };
		System.out.println(cities[3]);
		System.out.println("The size of my string array is: " + cities.length);
		// print name of cities
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		System.out.println();
		System.out.println("---------------");

	}

}
