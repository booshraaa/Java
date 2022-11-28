package com.neotech.lesson18;

public class Hw2 {
	public static void main(String[] args) {

		String str = "Today is Thursday and we have a Java Class!!!";

		// split and reverse

		// split
		Hw2 hw = new Hw2();
		String[] array = str.split(" ");
		for (String word : array) {
			String reversed = hw.reverse(word);
			System.out.print(reversed + " ");
		}
		System.out.println();

		// 2nd way
//		StringBuffer sb = new StringBuffer(word);
//		System.out.println(sb.reverse()+" ");

	}

	String reverse(String input) {
		String reversed = "";
		char[] letter = input.toCharArray();
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += letter[i];
		}
		return reversed;
	}

}
