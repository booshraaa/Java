package com.neotech.lesson19;

public class StaticKeyword {

	// instance variables
	// default
	String color;
	int memory;

	// static variable
	static String brand;
	static boolean touchscreen;

	// instance method
	// inside an instance method, we can use every variable
	void info() {
		System.out.println("we built a " + brand + " with " + memory + "GB with " + color + " color");
	}

	// static method
	// can't use instance variables, only static
	static void info2() {
		System.out.println("brand is " + brand + " and the touchscreen is " + touchscreen);
	}

	public static void main(String[] args) {
		// we don't need to create an object for static
		StaticKeyword.brand = "Iphone";
		// we're in the same class so we can access "touchscreen" w/o class name
		touchscreen = true;

		// however, if i wanna create an instance variable called touchscreen,
		// i have to distinguish them!!!

		// u need an object for instance variables
		StaticKeyword obj1 = new StaticKeyword();
		obj1.memory = 64;
		obj1.color = "red";

		obj1.info();

		// u can do this, but it's not the right way to re assign
		obj1.touchscreen = false;

		// instead, do this;
		StaticKeyword.touchscreen = true;

	}

}
