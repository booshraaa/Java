package com.neotech.lesson14;

public class DogShelter {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.breed = "Husky";
		d1.color = "smoky grey and white";
		d1.size = "large";
		d1.age = 1;

		d1.eat();
		d1.bark();
		d1.run();

	}

}
