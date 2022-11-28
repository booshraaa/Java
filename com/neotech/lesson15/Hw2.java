package com.neotech.lesson15;

public class Hw2 {
//	Create a class Student that will have a method getGrade.
//	Your method should accept the score of a student and return a grade:
//		score > 90 - A
//		score > 80 - B
//		score > 70 - C
//		score > 50 - D
//		anything else - F
	int getGrade(int a) {
		if (a >= 90) {
			System.out.println("Your score is " + a + " , return grade is A");
		} else if (a <= 89 && a >= 80) {
			System.out.println("Your score is " + a + " , return grade is B");
		} else if (a <= 79 && a >= 70) {
			System.out.println("Your score is " + a + " , return grade is C");
		} else if (a <= 69 && a >= 50) {
			System.out.println("Your score is " + a + " , return grade is D");
		} else {
			System.out.println("return grade is an F");
		}
		return a;

	}
}
