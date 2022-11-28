package com.neotech.lesson05;

public class Task2 {
	public static void main(String[] args) {
		//Create a Java program to check if it is Friday or not. If it is Friday,
		//print "It's Friday. I am going to watch a movie." and check the
		//date, if date is 13 print "I will watch a scary movie.". If date is not
		//13 print "I will watch a comedy.". If it is not Friday, print "It is NOT
		//Friday. I am going to study JAVA."
		
		boolean isFriday = true;
		int date = 15;
		
		if (isFriday)
		{
			System.out.println("It's Friday, im gonna watch a movie");
			if (date == 13)
			{
				System.out.println("watch a scary movie");
			}
			else
			{
				System.out.println("I will watch a comedy");
			}
		}
			else
			{
				System.out.println("it's not friday so imma study java");
			}
		//what if we have an extra condition saying that if it is 15th, i will watch a thriller???
		//we would have a nested "if else"
		if (isFriday)
		{
			System.out.println("its friday so imma watch a movie");
		}
		else if (date == 15)
		{
			System.out.println("i will watch a thriller movie");
		}
		else
		{
			System.out.println("i will watch a comedy");
		}
		}
	
				
		
				
				
		
	}


