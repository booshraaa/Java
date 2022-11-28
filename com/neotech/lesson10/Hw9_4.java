package com.neotech.lesson10;

import java.util.Scanner;

public class Hw9_4 {
	public static void main(String[] args) {
		/*
		 * create a program that will be asking the user to apply for a credit card 10
		 * times, as soon as you get a "yes" from a user program should stop asking
		 */

		// use the for loop method since there's a number of iterations
		// ask a maximum of 10 times, if you get a yes before
		// it, break the loop

		Scanner scan = new Scanner(System.in);
		String input;
		// ask user 10 times
		for (int i = 0; i < 10; i++) {
			System.out.println("Do you want to apply for a credit card");
			input = scan.next();

			if (input.equals("yes")) {
				System.out.println("Perfect, good choice!");
				break;
			}
		}

	}

}
