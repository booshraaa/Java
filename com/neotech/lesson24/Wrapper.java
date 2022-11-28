package com.neotech.lesson24;

public class Wrapper {
	public static void main(String[] args) {
		Integer num1 = new Integer(20); // boxing (don't use this way tho)
		int num2 = num1.intValue(); // un-boxing

		Integer num3 = 30; // auto boxing
		int num4 = num3; // auto un-boxing

		System.out.println(num2);
		System.out.println(num4);
		System.out.println(num1.toString());

		// Boolean b1 = new Boolean(false); // LONG WAY
		Boolean b2 = true; // SHORT WAY

		Byte b1 = 25; // auto boxing
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		Double d1 = 3.33;

		Character c1 = new Character('E'); // depricated method
		Character c2 = 'X'; // SHORT WAY

	}

}
