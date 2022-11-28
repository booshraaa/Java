package com.neotech.lesson03;

public class TaskPractice {
	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////
		/*
		 * Write a program to print the area and perimeter of a rectangle with width
		 * = 5 and height = 8. Your program should say. “The perimeter of a
		 * rectangle with width ___ and height ____ is equal to _____ and the area is"
		 * 
		 * 1) declare variables: h & w;
		 * 2) declare perimeter and area variables
		 * 3) calculate perimeter 
		 * 4) calculate area 
		 * 5) print sentence
	  	*/
		
		int w = 5;
		int h = 8; 
		
		int p,a; 
		
		p = 2*(h+w);
		a = h*w;
		
		System.out.println("The perimeter of a rectangle with width "+w+" and height "+h+" is equal to "+p+
				           " and the are is "+a+" ");
		
		/////////////////////////////////////////////////////////
		/*
		 * Write a Java program to convert fahrenheit to celsius 
		 * F=9/5*C+32
		 */
		
		float fahrenheit =43f; 
		float celsius = ((fahrenheit -32)*5)/9;
		
		System.out.println("Temperature in celcius is: "+celsius+" "); 
		
		/////////////////////////////////////////////////////////////
		/*
		 * Write a java program that converts mile to km
		 * 1 mile = 1.606344 km
		 * 3 miles = ?km
		 */
		
		double mile, km; 
		
		mile = 1.0;
		km = 1.609344; 
		
		km = 3*1.609344; 
		
		System.out.println("3 miles is equal to "+km+" kilometers ");
		
		/////////////////////////////////////////////////////
		/*
		 * Write a Java program that displays the Area of a rectangle with a width of 
		 * 4.5 and a height of 7.9 using the following formula: area = width * height			
		 */
		
		float A; 
		float W = 4.5f;
		float H = 7.9f;
		
		A = W*H;
		
		System.out.println("The area of the rectangle is "+A+" ");
		
		////////////////////////////////////////////////////////
		/*
		 * Write a java program that calculates the average of 3 numbers
		 */
		
		float X = 4f;
		float Y = 7f;
		float Z = 50f;  
		
		float sum;
		
		sum = (X + Y + Z)/3; 
		
		System.out.println("The average of these 3 numbers are "+sum+" ");
		
		
		
				
		
		
		
		
	
		
		
		
		
		
			
		
		
		
		
		
	}

}
