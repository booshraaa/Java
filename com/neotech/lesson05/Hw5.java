package com.neotech.lesson05;

public class Hw5 {
	public static void main(String[] args) {
	//Write a java program to check if a patient has allergies.
	// If the patient does not have allergies print “You’re healthy!”.
	// If the patient has allergies, check if it is a peanut allergy, lactose allergy, bee allergy or seafood allergy 
	// and print a statement telling the patient 
	//“Don’t eat ___”. (fill the line with the food names – peanut, seafood etc.)
		
		boolean P_allergy = true;
		boolean L_allergy = false;
		boolean B_allergy = false;
		boolean S_allergy = true;
		boolean no_allergy = false;
		
		if(P_allergy)
		{
			System.out.println("don't eat peanut");
		}
		if(L_allergy)
		{
			System.out.println("don't drink milk");
		}
		if(B_allergy)
		{
			System.out.println("Don't get stung by bees");
		}
		if (S_allergy) 
		{
			System.out.println("Don't eat fishies");
		}
		else
		{
			System.out.println("You're healthy");
		}
		System.out.println("**************************************");
		
		//Write a program to implement following logic using
		//if- else if -else statement:
		//if hour is less than 12 noon, greet with Good Morning
	    //if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
	    //if hour is greater than or equal to 3 pm, greet with Good Evening
		
		int hour;
		hour = 8;
		
		if(hour < 12) 
		{
			System.out.println("Good morning");
		}
		else if (hour >= 12 && hour < 3)
		{
			System.out.println("Good afternoon");
		}
		else if(hour >= 3) 
		{
			System.out.println("good evening");
		}
		else
		{
			System.out.println("Good night");
		}
		System.out.println("************************");
		
		// Write a Java Program to check whether number is Even or Odd.
		
		int number = 14;
		int number2 = 2;
		
		if(number % number2 == 0)
		{
			System.out.println("Number is even ");
		}
		else
		{
			System.out.println("Number is odd ");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
