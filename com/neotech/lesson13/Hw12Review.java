package com.neotech.lesson13;

public class Hw12Review {
	public static void main(String[] args) {
		String[][] names = { { "Joe", "Barack", "Bernie", "Donald" }, { "Trump", "Obama", "Biden", "Sanders" }, };
		System.out.println(names[0][1] + " " + names[1][3]);
		System.out.println(names[1][0] + " " + names[0][2]);
		System.out.println(names[0][2] + " " + names[1][1]);
		System.out.println(names[0][3] + " " + names[1][3]);

		System.out.println("//////////////////////////");
//		2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
//		Then you program should print name of the students that has A and B grade
		String[][] namesx = {

				{ "bella", "edward", "jacob", "resume" }, { "A", "B", "C", "B" } };
		for (int i = 0; i < namesx[1].length; i++) {
			if (namesx[1][i].equals("A") || namesx[1][i].equals("B")) {
				System.out.println(namesx[0][i] + " " + namesx[1][i]);
			}
		}

	}
}