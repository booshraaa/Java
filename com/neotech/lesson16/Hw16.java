package com.neotech.lesson16;

public class Hw16 {
	public static void main(String[] args) {
		String str = "Print this w/o spaces";
		String[] array = str.split(" ");
		for (String split : array) {
			System.out.print(split);
		}
		System.out.println();

		String mix = "f$ck, sh*t, b!tch";
		// String mix2 = mix.replace("[*$!]");
		// System.out.println(mix2);
	}

}
