package com.neotech.lesson20;

public class Constructor {

	String name;
	int age;

	// default
	// must have the same name of the class
	// no parameter
	Constructor() {
		System.out.println("i am a non-argument constructor");
	}

	// this one has parameter
	Constructor(String str) {
		System.out.println("i am a constructor with string " + str);
	}

	// this one has parameter
	Constructor(int num) {
		System.out.println("i am a constructor with an int " + num);
	}

	// signature: string & int
	Constructor(String str, int num) {
		System.out.println("i am a constructor with a string " + str + " and an int " + num);
	}

	/*
	 * The "signature" needs to be different in methods Java knows which method ur
	 * calling based on your input if the signature is int & int, Java will
	 * understand bc for ex you'd be putting 30 & 40
	 * 
	 */

	public static void main(String[] args) {
		// Default
		Constructor ct = new Constructor();
		System.out.println(ct.name + " " + ct.age);

		// String parameter
		Constructor ct2 = new Constructor("Sabah");

		Constructor ct3 = new Constructor("Harun", 25);

		Constructor ct4 = new Constructor(777);
	}

}
