package com.neotech.lesson19;

public class Task {
//	Create a method that will accept an array as
//	parameters and will return a sum of all elements from
//	that array. Method should be visibly only within same
//	package and accessible by the creating an instance
//	of the class.

	int[] array = { 22, 44, 77 };

	protected void sumarray() {
		System.out.println(array[0] + array[1] + array[2]);
	}

	public static void main(String[] args) {
		Task sum = new Task();
		sum.sumarray();

	}
}
