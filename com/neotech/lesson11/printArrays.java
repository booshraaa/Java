package com.neotech.lesson11;

public class printArrays {
	public static void main(String[] args) {

		int[] points = { 90, 85, 95, 75, 93, 95, 100 };

		// printing one by one:
		System.out.println(points[0]);
		System.out.println(points[1]);
		// so on and so on.....

/////////////////////////////////////////		
		System.out.println("---------------------------------");
/////////////////////////////////////////

		// printing all together
		int length = points.length;
		for (int i = 0; i < length; i++) {

			System.out.print(points[i] + " ");

		}
		System.out.println();
		// ^^^

		// how can we get the sum???
		int sum = 0;
		// sum = points[0] + points[1]...so on and so on...
		for (int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + sum / length);

		System.out.println();
	}

}
