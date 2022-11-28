package com.neotech.lesson18;

public class DogWoof {
	public static void main(String[] args) {
		// how can i access variables?

		Dog d1 = new Dog();
		d1.name = "cakal";
		d1.age = 3;
		d1.info();

		// how can i access static variables?
		// access it by using the class name

		System.out.println(Dog.breed);
		System.out.println(Dog.paws);

		// reassigning static variable
		Dog d2 = new Dog();
		d2.name = "karabas";
		d2.age = 7;
		d2.info();

		System.out.println("-----");
		Dog.breed = "golden";
		d1.info();
		d2.info();

		Dog d3 = new Dog();
		d3.name = "esekoglu esek";
		d3.age = 5;
		d3.info();

	}

}
