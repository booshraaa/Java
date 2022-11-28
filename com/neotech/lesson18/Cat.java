package com.neotech.lesson18;

public class Cat {
	String name;
	int weight;
	String color;

	void sayMeow() {
		String word = "meow";
		System.out.println(word);
	}

	void info() {
		System.out.println("name: " + name + ", weight: " + weight + ", color: " + color);
	}

}
