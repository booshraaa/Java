package com.neotech.lesson03;

public class ModulusPractice {
	public static void main(String[] args) {
		
		int a = 25;
		int b = 4;
		int div;
		int rem;
		
		div = a/b; //=6
		rem = a%b; //=1 (bc 24 is divisive by 6)
		
		System.out.println(div);
		System.out.println(rem);
		
		
		
		int c = 13;
		int d = 5;
		
		int rem2 = 13%5; 
		
		System.out.println(rem2);
		
		//Ex;
		/*
		 * input two numbers
		 * (modulus is used to prevent errors)
		 */
		
		double d1 = 2.434;
		double d2 = 3.435;
		
		int num1 = 7;
		int num2 = 2;
		
		int rem3 = 7%2;
		int resnum = 7/2;
		double d3 = d1/d2;
		
		System.out.println(resnum);
		System.out.println(d3);
		
		
		//Short hand operations
		int numA = 5; 
		int numB = 6;
		int sum = 0;
		
		sum = numA + numB; //(add to sum the numbers)
		
		//if we wanna change the numA itself?
		// we would re-assign
		// and add another value to it
		
		numA = 8;
		numA = numA + 8; 
		
		
	}

}
