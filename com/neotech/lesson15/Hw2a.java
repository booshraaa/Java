package com.neotech.lesson15;

import java.util.Scanner;

public class Hw2a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hw2 obj = new Hw2();
		System.out.println("What is your score?");
		int a = input.nextInt();

		int result = obj.getGrade(a);

	}

}
