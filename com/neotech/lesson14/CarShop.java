package com.neotech.lesson14;

public class CarShop {
	public static void main(String[] args) {
		// let's create some cars for our shop

		Cars car1 = new Cars();
		car1.make = "toyota";
		car1.model = "camry";
		car1.color = "black";
		car1.year = 2019;
		car1.mileage = 25000;
		car1.maxspeed = 200;

		System.out.println(car1.make + " " + car1.model + " " + car1.color + " " + car1.year + " " + car1.mileage + " "
				+ car1.maxspeed);

		car1.drive();
		car1.stop();
		car1.transport();

		System.out.println("-------------------------");
		/////////////////////////////////////////////////////
		Cars car2 = new Cars();
		car2.make = "subaru";
		car2.model = "brz";
		car2.color = "black";
		car2.year = 2021;
		car2.mileage = 25000;
		car2.maxspeed = 200;

		System.out.println(car2.make + " " + car2.model + " " + car2.color + " " + car2.year + " " + car2.mileage + " "
				+ car2.maxspeed);

		car2.drive();
		car2.stop();
		car2.transport();

		Cars car3 = new Cars();

	}

}
