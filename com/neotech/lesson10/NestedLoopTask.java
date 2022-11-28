package com.neotech.lesson10;

public class NestedLoopTask {
	public static void main(String[] args) {
//print this structure using a nested for loop.
//
//		1
//		22
//		333
//		4444
//		55555

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				// do this as many as the value of 1
				System.out.print(i);
			}
			// print a new line,jump to outer loop
			System.out.println();
		}
	}

}
