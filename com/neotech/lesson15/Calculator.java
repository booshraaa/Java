package com.neotech.lesson15;

public class Calculator {

	// we want to add two numbers

	void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	void multiply(int a, int b) {
		System.out.println(a * b);
	}

	void divide(double a, double b) {
		System.out.println("The division of " + a + " by " + b + " is " + (a / b));
	}

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		System.out.println("Addition");
		obj.add(3, 3);
		obj.add(2, 9);
		obj.add(24, 2);

		System.out.println("Multiply");
		obj.multiply(4, 2);
		obj.multiply(3, 3);

		System.out.println("Division");
		obj.divide(20.0, 0);
		obj.divide(15.3, 5.7);

	}

}
