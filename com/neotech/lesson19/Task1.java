package com.neotech.lesson19;

public class Task1 {
//	Create a method that will accept an array as
//	parameters and will return a sum of all elements from
//	that array. Method should be visibly only within same
//	package and accessible by the creating an instance
//	of the class.

	// method:
	// return type: int (sum)
	// parameters: int array
	// use default as access modifier

	// 1st way
	int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

//	//2nd way
//	for (int element:array) {
//		sum+=element;
	public static void main(String[] args) {
		Task1 onj = new Task1();
		int[] array = { 22, 44, 77 };
		int sum = onj.sum(array);
		System.out.println("Total is " + sum);
	}

}
