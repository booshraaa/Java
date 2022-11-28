package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		//Find the largest among 3 numbers
		
		//Declaring three double variables
		double a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		// Use nested if for this problem
		
		//Logic:
		// if a > b
			// if a > c
			// a is largest 
		//if c is larger than a 
		//else --> if b > c
			//b is largest 
			//else --> c > b
			//c is largest
		
		if (a > b) 
		{
			if (a > c)
			{
				System.out.println(a + " is the largest number");
			}
			else  // if a<c
			{
				System.out.println(c + " is the largest number");
			}
		}
		else // a<b
		{
			if (b > c) // b>a & b>c
			{
				System.out.println(b+" is the largest number");
			}
			else //b<c
			{
				System.out.println(c + " is the largest number");
			}
		}
		
		
		if (a > b && a > c)
		{
			System.out.println(a+ "is the largest");
		}
		else if (b > a && b > c)
		{
			System.out.println(b + "is the largest");
		}
		else
		{
			System.out.println(c+" is the largest");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
