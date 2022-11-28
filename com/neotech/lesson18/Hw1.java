package com.neotech.lesson18;

public class Hw1 {
	public static void main(String[] args) {
		String str = "Sunday";

		// 1st way
		System.out.println(str.charAt(0));
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		}
		System.out.println();

		// 2nd way
		char[] charArray = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = charArray[i];
			System.out.print(c);
		}
		System.out.println();

		// 3rd way
		StringBuffer strbf = new StringBuffer(str);
		strbf.reverse();
		System.out.println(strbf);

		// 4th way
		StringBuilder strbl = new StringBuilder(str);
		strbl.reverse();
		System.out.println(strbl);

		// immutable
		str.toUpperCase();
		System.out.println(str.toUpperCase());

	}

}
