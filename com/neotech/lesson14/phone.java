package com.neotech.lesson14;

public class phone {
//		Homework 1:
//	    Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.

	String brand, model, color;
	int year;

	void tase() {
		System.out.println("You can tase someone with a " + brand + " " + model);
	}

	void cook() {
		System.out.println("You can BBQ on a " + brand + " " + model);
	}

	void xray() {
		System.out.println("You can take x-rays on a " + brand + " " + model);
	}

	void kill() {
		System.out.println(brand + " " + model + " can kill people");
	}

	public static void main(String[] args) {
		phone p1 = new phone();
		p1.brand = "iPhone";
		p1.model = "30";
		p1.color = "darkness";
		p1.year = 2053;

		p1.cook();
		System.out.println("--");

		phone p2 = new phone();
		p2.brand = "Samsung";
		p2.model = "XRZ";
		p2.color = "aurora green";
		p2.year = 2052;

		p2.xray();
		System.out.println("--");

		phone p3 = new phone();
		p3.brand = "nokia";
		p3.model = "death trap";
		p3.color = "black hole";
		p3.year = 2022;

		p3.tase();
		p3.kill();

	}

}
