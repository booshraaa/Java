package com.neotech.lesson12;

public class RetrieveElements {
	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// loop through the grades atray
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println();

		// 2nd way: enhanced loop / advanced for loop / for-each loop
		for (char elements : grades) {
			System.out.print(elements + ", ");

		}
		System.out.println();
		System.out.println("--------------");

		String[] fruits = { "apple", "orange", "peach", "watermelon", "kiwi", "banana" };
		// let's print the fruits
		for (int j = 0; j < fruits.length; j++) {
			// System.out.print(fruits[j] + ", ");
			// let's print our fav fruit
			if (fruits[j].equals("watermelon")) {
				System.out.println(fruits[j] + " is my favorite fruit");
			} else {
				System.out.println(fruits[j]);
			}
		}
		System.out.println("--------------------");
		// let's do it the 2nd way (for each loop)
		for (String elements1 : fruits) {
			if (elements1.equals("watermelon")) {
				System.out.println(elements1 + " is my favorite fruit");
			} else {
				System.out.println(elements1);
			}
		}

	}
}