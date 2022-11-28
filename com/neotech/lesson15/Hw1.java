package com.neotech.lesson15;

import java.util.Scanner;

public class Hw1 {
//	Create a method createEmail(). Based on provided users firstName, lastName and emailType, your method should return complete email address.
//			Example: 
//			firstName -> john
//			lastName -> snow
//			emailType -> gmail
//			return -> johnsnow@gmail.com
	String createEmail(String firstName, String lastName, String emailType) {
		return firstName + lastName + "@" + emailType + ".com";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Hw1 obj = new Hw1();
		System.out.println("enter first name");
		String firstName = input.next();

		System.out.println("enter last name");
		String lastName = input.next();

		System.out.println("enter email type");
		String emailType = input.next();

		String result = obj.createEmail(firstName, lastName, emailType);
		System.out.println(result);

	}

}
