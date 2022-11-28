package com.neotech.lesson10;

import java.util.Scanner;

public class Hw9 {
	public static void main(String[] args) {
		/*
		 * write a program that asks the user to enter his/her username and password
		 * until the user enters them correctly
		 */

		// how do we decide?
		// for or while or do while?
		// for is more suitable for a countable loop
		// do while seems more suitable for this assignment

		Scanner scan = new Scanner(System.in);
		String userName = "shane";
		String password = "123456";

		String userNameInput = "userName";
		String passwordInput = "password";

		do {
			System.out.println("Enter username and password");
			userNameInput = scan.next();
			passwordInput = scan.next();

			if (userNameInput.equals(userName) && passwordInput.equals(password)) {
				System.out.println("You are now logged in!");
				break;
			} else {
				System.out.println("wrong username or password");
			}

		} while (userNameInput != userName || passwordInput != password);
	}

}
