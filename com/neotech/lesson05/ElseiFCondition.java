package com.neotech.lesson05;

public class ElseiFCondition {
	public static void main(String[] args) {
		
		double d1 = 15.5;
		double d2 = 15; 
		
		//d1 > d2 --> same as saying that d2 < d1
		//d1 == d2
		//d1 < d2
		
		if (d1 > d2) 
		{
			System.out.println("number " + d1 + " is larger than "+d2);
		}
		else if (d1 < d2)
		{
			System.out.println("number "+d1 +" is less than " + d2);
		}
		
		else
		{
			System.out.println("number " + d1 + " is equal to "+ d2);
		}
		
		
		// else if is used for exclusive options, meaning if one of them is true, then ll the others are false
		int a = 5;
		int b = 7;
		
	if(a == b)
	{
		System.out.println("Number " +a+" is equal to "+b);
	}
		
	else if (a < b)
	{
		System.out.println("Number "+a+"is less than "+b);
	}
	else //3(a > b)
	{
		System.out.println("Number " +a+" is larger than "+b);
	}
		//if we have;
		/*
		 * 1. a ==b
		 * 2. a != b
		 */
	}
		
		
		
		
		
	}


