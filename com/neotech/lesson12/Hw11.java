package com.neotech.lesson12;

public class Hw11 {
	public static void main(String[] args) {
		// create an array of integers and calculate the sum
		// of all elements in the array
		// (use 2 different loops)

		int numbers[] = new int[4];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		int total = 0;
		for (int i = 0; i < 4; i++) {
			total += numbers[i];
		}
		System.out.println("The total is " + total);

		System.out.println("----------------");
		// For-each loop:
		int total1 = 0;
		for (int elements : numbers) {
			total1 += elements;
		}
		System.out.println("The total is " + total);

	}
}