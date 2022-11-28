package com.neotech.lesson06;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	 //^^^declaration	^^^Assigning a value to variable
		
		//write a program that asks the user to enter two numbers
		//and prints which one is larger 
		
		System.out.println("Enter 1st number");
		int num1 = input.nextInt();
		System.out.println("1st number is: "+num1);
		
		System.out.println("Enter 2nd number");
		int num2 = input.nextInt();
		System.out.println("2nd number is: "+num2);
		
		if (num1 > num2)
		{
			System.out.println(num1 +" is larger than "+num2);
		}
		else if (num2>num1)
		{
			System.out.println(num2+ " is larger than "+num1);
		}
		else
		{
			System.out.println(num1+" is equal to "+num2);
		}
	
	}

}
