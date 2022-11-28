package com.neotech.lesson14;

public class Dog {
	String breed, size, color;
	int age;

	void eat() {
		System.out.println(breed + " eats");
		System.out.println(size + " " + breed + " eats");
	}

	void run() {
		System.out.println(breed + " runs");
	}

	void bark() {
		System.out.println(breed + " barks");
	}

}
