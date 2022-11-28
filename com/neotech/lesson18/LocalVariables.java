package com.neotech.lesson18;

public class LocalVariables {
	void method1() {
		// local variables are only visible within methods
		String name = "Gloria";
		int age = 28;
		System.out.println(name);
		System.out.println(age);
	}

	void method2() {
		String name = "mustafa";
		System.out.println(name);
	}

	public static void main(String[] args) {

		boolean flag = true;
		if (flag) {
			String answer = "yes";
			System.out.println(answer);
		}

		// the scope/lifetime of "answer" is only the if block
		// the scope/lifetime of "flag" is the main method
		System.out.println("---------");

		for (int i = 0; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------");
		int x;
		for (x = 1; x <= 5; x++) {
			System.out.println(x);
		}
		System.out.println(x); // if u print x again, it'll go up to 6 instead of 5
		// (it'll get out of the loop), override it

		String name = "elion";

		LocalVariables obj1 = new LocalVariables();
		obj1.method1();
		obj1.method2();
	}

}
