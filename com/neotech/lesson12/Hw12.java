package com.neotech.lesson12;

public class Hw12 {
	public static void main(String[] args) {

//		1. Create a 2D array where you will store the following values:
//			- Mr, Mrs, Ms, Miss
//			-Smith, Jordan, Jackson, Obama.
//
//			After storing values print the following:
//			Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
//
//			* Be careful because they are mixed.

		String[][] names = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" }, };

		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);

		System.out.println("---------------");
//			2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
//			Then you program should print name of the students that has A and B grade
		String[][] namesx = { { "ed", "edd", "eddi", "eddie" }, { "a", "b", "c", "d" }, };
		System.out.println(namesx[0][0] + " " + namesx[1][0]);
		System.out.println(namesx[0][1] + " " + namesx[1][1]);
		System.out.println(namesx[0][2] + " " + namesx[1][2]);
		System.out.println(namesx[0][3] + " " + namesx[1][3]);

	}
}
