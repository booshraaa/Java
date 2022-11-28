package com.neotech.lesson15;

public class Task1 {
//	method1: Create a method that will take 2 parameters as numbers
//	and prints which number is larger.

//method2: Create a method that will take a number and prints whether
//	the number is even or odd.

//method3: Create a method that will say Hello in a different language
//based on the country that will passed when method is executed.

	void method1(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger");
		} else {
			System.out.println(b + " is larger");
		}
	}

	void method2(double a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else if (a % 2 != 0) {
			System.out.println(a + " is odd");
		}

	}

	void method3(String country) {

		if (country == "turkey") {
			System.out.println("merhaba");
		} else if (country == "usa") {
			System.out.println("hello");
		}

	}

	public static void main(String[] args) {
		Task1 m1 = new Task1();
		Task1 m2 = new Task1();
		Task1 m3 = new Task1();

		m1.method1(3, 7);
		m2.method2(20.0);
		m3.method3("usa");

	}

}
