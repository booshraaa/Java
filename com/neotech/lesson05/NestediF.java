package com.neotech.lesson05;

public class NestediF {
	public static void main(String[] args) {
		
		//if it is morning --> say good morning
		//if it is a school day --> you are at school
		//if it is not a school day --> you are at home
		//else (not morning) --> good afternoon
		
		boolean isMorning = false;
		boolean isSchoolday = true;
		
		if (isMorning)
		{
			System.out.println("Good Morning");	
			if (isSchoolday)
		{
			System.out.println("You are at school");
		}
		else
		{
				System.out.println("You are at home");
		}
		}
		else 
		{
			System.out.println("good afternoon");
		}
		
		
		
		
		
		
		
		
		
		
		
		}
	}


