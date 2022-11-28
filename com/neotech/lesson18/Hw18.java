package com.neotech.lesson18;

public class Hw18 {
	String name;
	int ID;
	static int number = 0;

	void info() {
		System.out.println(name + ", " + ID + ", " + number);
	}

	public static void main(String[] args) {
		Hw18 s1 = new Hw18();
		Hw18 s2 = new Hw18();
		Hw18 s3 = new Hw18();

		s1.name = "ed";
		s1.ID = 444;
		Hw18.number++;
		s1.info();

		s2.name = "eddie";
		s2.ID = 777;
		Hw18.number++;
		s2.info();

		s3.name = "eddy";
		s3.ID = 222;
		Hw18.number++;
		s3.info();

	}

}
