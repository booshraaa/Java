package com.neotech.lesson04;

public class PrimitiveCasting {
	public static void main(String[] args) {
		// byte-->short-->int-->long-->float-->double
		//casting: converting an integer to decimal
		//widening, implicit casting: automatically
		//narrowing, explicit casting: manually done when tryna store a big variable in a small variable
		
		double d1 = 7.5;
		System.out.println(d1); //no casting
		
		double d2 = 7; 
		System.out.println(d2); //casting
		
		int num1 = 10;
		double d3 = num1; //implicit casting done automatically
		System.out.println(d3);
		
		//int num2 = 7.9; //compiler error, type mismatch
		//^^^can not store a double in an integer
		//^^^narrowing, explicit casting that is manually done
		
		//*******************************************
		int num2 = (int) 7.9;
		System.out.println(num2);
		//^^^Manually telling Java that I wanna store it as ain integer
		
		byte b1 = (byte) 12345; //<<< narrowing explicit casting
		System.out.println(b1); //don't worry ab why the result is 57 lol
		
		int i2 = 5;
		byte b2 = (byte)12; 
		System.out.println(b2);
	}

}
