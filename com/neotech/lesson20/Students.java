package com.neotech.lesson20;

public class Students {
	String name;
	int g1, g2, g3;

	Students(String name, int g1, int g2, int g3) {
		int result = (g1 + g2 + g3) / 3;
		System.out.println(name + "'s grade average is " + result);
	}

	public static void main(String[] args) {
		Students s1 = new Students("Ed", 78, 88, 90);
		Students s2 = new Students("Eddie", 77, 99, 68);
		Students s3 = new Students("Eddy", 88, 57, 87);
		Students s4 = new Students("Alex", 60, 100, 80);
		Students s5 = new Students("Joe", 100, 99, 88);

	}

}
