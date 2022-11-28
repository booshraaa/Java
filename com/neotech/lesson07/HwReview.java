package com.neotech.lesson07;

import java.util.Scanner; //Ctrl + shift + o

public class HwReview {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    //   Class  name  = new class name
	//     ^     ^       ^       ^
		
		String text1, text2, text3; //Declaring Strings
		int age, year; //Declaring integers
		double salary;
		boolean isRaining;
		char gender;
		
		
//		System.out.println("Enter a sentence");
//		text1 = input.nextLine(); //reads until it finds a space
//		System.out.println(text1);
		
//		text2 = input.nextLine();
//		System.out.println(text2); //reads the word after the space
		
//		text3 = input.nextLine(); //reads until end of line
//		System.out.println(text3);
		
		//what's the difference between next and nextline?^^^
		
//		System.out.println("How old are you?");
//		age = input.nextInt();
//		System.out.println("age is "+age);
		
//		System.out.println("what year is it");
//		year = input.nextInt();
//		System.out.println("the year is "+year);
		
//		System.out.println("enter your age and year: ");
//		age = input.nextInt();
//		year = input.nextInt();
//		System.out.println(age + " "+ year);
	
//		System.out.println("ent3r your salary");
//		salary = input.nextDouble();
		
//		System.out.println("is it raining");
//		isRaining = input.nextBoolean();
//		System.out.println(isRaining);
	
//		System.out.println("enter your gender (M or F): ");
//		gender = input.next().charAt(0);  //method chaining
//		System.out.println(gender);
		//method chaining:
		/*
		 * Two steps:
		 * 1. read the word with next()
		 * 2. get the char you need with charAt()
		 */
//		String str = input.next();
//		gender = str.charAt(0);
//		System.out.println(gender);
		
		System.out.println("Enter your name, city, age, gender, and salary");
		//Busra, Nazareth, 19, female, 100000
		text1 = input.next(); //busra
		text2 = input.nextLine(); //nazareth  //press enter after nextLine
		age = input.nextInt(); //19
		gender = input.next().charAt(0); //bc in java indexing starts @ 0
		salary = input.nextDouble();
		
		System.out.println(text1 + " " + text2 + " " + age + " " + gender + " " + salary);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
