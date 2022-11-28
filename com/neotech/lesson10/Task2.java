package com.neotech.lesson10;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
// get input from the user, then based on that print this structure
// for ex: input = 6
//				1
//				22
//				333
//				4444
//				55555
//				666666
//				55555
//				4444
//				333
//				22
//				1
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int input = scan.nextInt();

		// decrement
		for (int row = 1; row <= input; row++) {
			for (int column = 0; column < row; column++) {
				System.out.print(row);
			}
			System.out.println();
		}
		// increment
		for (int row = input - 1; row > 0; row--) {
			for (int column = 0; column < row; column++) {
				System.out.print(row);
			}
			System.out.println();
		}

	}

}
