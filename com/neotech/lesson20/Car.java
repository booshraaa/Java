package com.neotech.lesson20;

public class Car {
	String make, model;
	int year;

	Car() {
		System.out.println("i am a default constructor!");
	}

	Car(String carMake, String carModel, int carYear) {
		System.out.println("We are creating an object w parameters!");
		make = carMake;
		model = carModel;
		year = carYear;
	}

	void info() {
		System.out.println("I have a " + year + " " + make + " " + model);
	}

	public static void main(String[] args) {
		// with default constructor
		Car car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "G-Wagon";
		car1.year = 2020;
		car1.info();

		// with parameterized constructor
		Car car2 = new Car("BMW", "M5", 2020);
		car2.info();

	}

}
