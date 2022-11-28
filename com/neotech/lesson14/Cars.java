package com.neotech.lesson14;

public class Cars {

	// what features does a car have?
	/*
	 * make model color year mileage max speed /*
	 * 
	 * //what behaviors does a car have? /* drive stop transport
	 */

	// How can we create features?
	String make;
	String model;
	String color;
	int year;
	int mileage;
	int maxspeed;

	// How can we create behaviors?
	// return type method name ()
	// {
	// ...your code goes here...
	// }

	void drive() {
		System.out.println(make + " " + model + " drives!");
	}

	void stop() {
		System.out.println(make + " stops!");
	}

	void transport() {
		System.out.println(make + " can transport people!");
	}

	public static void main(String[] args) {
		// how do we create an object from our blueprint?
		int a = 5; // This is in our main method
		int b;

		Cars car1 = new Cars();
		// what does this line do?
		// we declared an object

		// 1. declaring an object of class Car
		// 2. instantiation (new)
		// 3. car() -- initialization

		car1.make = "toyota";
		car1.model = "camry";
		car1.color = "red";
		car1.year = 2019;
		car1.mileage = 25000;
		car1.maxspeed = 220;

		System.out.println(car1.make + " " + car1.model + " " + car1.year);

		car1.drive();
		car1.stop();
		car1.transport();

	}

}
