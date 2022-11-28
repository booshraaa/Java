package com.neotech.lesson18;

public class CatPurrr {
	public static void main(String[] args) {
		Cat cat1 = new Cat(); // created an instance of Cat
		cat1.name = "Tekir";
		cat1.weight = 8;
		cat1.color = "black";

		cat1.sayMeow();
		cat1.info();

		Cat cat2 = new Cat(); // created an instance of Cat
		cat2.name = "sino";
		cat2.weight = 9;
		cat2.color = "B&W";

		System.out.println(cat1.name + " is " + cat1.color);
		System.out.println(cat2.name + " is " + cat2.color);

		cat1.name = "Muzo";
		System.out.println(cat1.name);
		cat1.info();

	}

}
