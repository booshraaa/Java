package com.neotech.lesson16;

public class StringMethodsExtra {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter something");
//		char letter = scan.next().charAt(1);
//		System.out.println(letter);

		// if u say hello, it'll print out "e" as index 1 @ charAt(1)

		String name = "Eulises";
		char letter1 = name.charAt(1);
		System.out.println("letter: " + letter1);

		int index = name.indexOf('e');
		System.out.println("Index of e is: " + index);

		String name1 = "Burak";
		System.out.println("Index of u: " + name1.indexOf('u'));
		System.out.println("Index of ak: " + name1.indexOf("ak"));

		// subString()
		String message = "Today is good";
		String substr = message.substring(7);
		System.out.println(substr);

		String substr2 = "Today is good";
		System.out.println(substr2.substring(2, 6));
	}

}
