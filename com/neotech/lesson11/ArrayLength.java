package com.neotech.lesson11;

public class ArrayLength {
	public static void main(String[] args) {

		// arrays: collection of same type data

		String name = "Sabah";
		String name2 = new String("Sabah");
		String[] student = new String[5];
		// (Default value for string is null)

		student[0] = "Fatihcan";
		student[1] = "Oguzhan";
		student[2] = "Abdullah";
		student[3] = "Oktay";
		student[4] = "Burak";

		// How can we get the length of an array???
		int length = student.length;
		System.out.println("the length of the student array is: " + length);

		// Another way of declaring an array
		int[] scores = { 90, 80, 70, 60, 50, 40 };
		System.out.println("the length of scores array is: " + scores.length);

	}

}
