package com.neotech.lesson06;

import java.util.Scanner;

public class Scannerdemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter your name!");
		String name = input.next();
		System.out.println("Your name is: "+ name);
		
		System.out.println("Please enter your age!");
		int age = input.nextInt();
		System.out.println("Your age is: "+ age);
		
		System.out.println("please enter your age as double!");
		double ageDouble = input.nextDouble();
		System.out.println("your age in double is: "+ageDouble);
		
		System.out.println("is it raining? (true/false");
		boolean raining = input.nextBoolean();
		System.out.println("Is it raining? "+ raining);
		
		
	}
}
