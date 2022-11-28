package com.neotech.lesson06;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
				//write a program that asks a user to enter 
				//first name and last name, then u get both of them and print full name
						
				System.out.println("Please enter your first name");
				String name1 = input.next();
				System.out.println("Your first name is: "+name1);
				
				System.out.println("Please enter your last name");
				String name3 =  input.next();
				System.out.println("Your last name is: "+name3);
				
				System.out.println("please enter your first and last name");		
				System.out.println("Your first and last name is: "+name1+" "+name3);
						
				
				
	}

	
		
					
}
