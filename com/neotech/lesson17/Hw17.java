package com.neotech.lesson17;

import java.lang.reflect.Array;

public class Hw17 {
	public static void main(String[] args) {
		// #1
		StringBuffer str = new StringBuffer(" tahw orb");
		System.out.println(str.reverse());

		System.out.println("-------------");
		// #2
		String str2 = "How many words are in this string?";
		String[] split = str2.split(" ");
		for (String array : split) {
			System.out.println(array);
		}
		System.out.println(Array.getLength(split));

		System.out.println("----------");
		// #3
		// IS THIS CORRECT????
		String str3 = "is it saturday? is it raining? do we have a java class today? ";
		String[] split2 = str3.split("\\?");
		for (String array2 : split2) {
			System.out.println(array2);
		}
		System.out.println(split2.length);
	}

}
