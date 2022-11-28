package com.neotech.lesson15;

public class MethodIntro {

	// void doesn't return anything
	void greet() {
		System.out.println("Hello");
		System.out.println("BFFR");
		System.out.println("be fuckin fr");
	}

	void greet2(String name) {
		System.out.println("hello " + name);
		System.out.println("How are you " + name);

	}

	public static void main(String[] args) {
		// calling a method --> executing a method
		MethodIntro obj = new MethodIntro();
		obj.greet();
		obj.greet2("ur mom");

		String name = "ur mom lol";
	}

}
