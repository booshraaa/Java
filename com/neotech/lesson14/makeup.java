package com.neotech.lesson14;

public class makeup {
	String item, brand, size;

	void f1() {
		System.out.println(item + " will brighten under eyes");
	}

	void f2() {
		System.out.println(item + " will minimize pores and give a smooth finish");
	}

	void f3() {
		System.out.println(item + " will give you rosy cheeks");
	}

	void f4() {
		System.out.println(brand + " is an expensive brand");
	}

	public static void main(String[] args) {
		makeup m1 = new makeup();
		m1.item = "concealer";
		m1.brand = "elf";
		m1.size = "full size";
		m1.f1();

		System.out.println("--");
		makeup m2 = new makeup();
		m1.item = "setting powder";
		m1.brand = "maybelline";
		m1.size = "travel size";
		m1.f2();
		System.out.println("--");

		makeup m3 = new makeup();
		m3.item = "lipstick";
		m3.brand = "YSL";
		m3.size = "full size";
		m3.f4();

	}

}
