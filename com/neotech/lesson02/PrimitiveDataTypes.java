package com.neotech.lesson02;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		// There are 8 primitive data types in java
		/*
		 * To store WHOLE numbers,we can use;
		 * byte --> (-128 to 127)
		 * short --> (-32768 to 32767)
		 * int --> (-2billion to 2 billion)
		 * long --> (
		 */
		
		byte var1 = -15; 	
		// the range is from -128 to 127 (total of 256 different values)
		// CANNOT use "byte var1 = 130;" bc it's bigger than 127)
		
		short varShort = 130; 
		// CANNOT use "short varShort = 3.5;" bc it's a decimal
		// compiler error
		
		int var3 = 76456;
		// CANNOT use "var1" more than once
		// CAN store a small number in a big container
		
		long number = 87267382L; 
		// if the # is greater than 2bil, you have to put a L or l at the end
		
		/*
		 * to store DECIMAL numbers, we can use;
		 * float --> 
		 * double --> 
		 */
		
		float number2 = 3.5F; 
		//MUST use F or f at the end of a float 
		
		double number3 = 35.56789; 
		//DO NOT need F or f at the end of double 
		//double is preferred over float 
		//double will store more digits over float 
		
		System.out.println(number2); //float stores up to 5 digits after decimal
		System.out.println(number3); 
		
		/*
		 * char --> stores one single character
		 */
		
		char var5 = 'a';
		char var6 = 'A';
		char var7 = '$';
		char var8 = ' '; //(space)
		char var9 = '7';
		
		System.out.println(var7);
		

		
	

		
		
		
	}

}
