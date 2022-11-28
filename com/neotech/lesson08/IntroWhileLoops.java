package com.neotech.lesson08;

public class IntroWhileLoops {
	public static void main(String[] args) {

		// WHILE LOOP
		// Do while loop
		// For loop
		// Enhanced loop

		int time = 8;

		// infinite unless you terminate it
		while (time < 12) {
			System.out.println(time);
			time++;
			time += 2;
		}

		// How to print #'s from 20-30
		int a = 20;
		while (a < 30) {
			// System.out.println("condition "+(a<30));
			// System.out.println(a);
			System.out.print(a + " ");
			a++;
		}

		System.out.println();
		// How do we print #'s 5 to 25?
		int b = 5;
		while (b <= 25) {
			System.out.print(b++ + " ");
			// b++;
		}

		System.out.println();
		// how can we print #'s 10 to 1
		int c = 10;
		while (c >= 1) {
			System.out.print(c + " ");
			c--;
		}

		System.out.println();
		// how can we print #'s 50 to 17
		int d = 50;
		while (d >= 17) {
			System.out.print(d + " ");
			d--;
		}

		System.out.println();

		// how can we print only even #'s from 50 to 17
		int e = 50;

		while (e >= 17)
		
		{
			if (e % 2 == 0) {
				System.out.print(e + " ");
			}

			e--;
		}


	}

}
