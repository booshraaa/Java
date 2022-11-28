package com.neotech.lesson04;

public class CompoundOperator {
	//AKA short hand operator
	
	public static void main(String[] args) {
		int num = 100; //(create a box and store 100)
		num = num + 100; //add 100 to the value inside the box
		System.out.println(num); //200
		
		num = num + 100;
		System.out.println(num); //300
		
		// We can use compound/shorthand operators which are shorter
		num += 100;
		System.out.println(num); //it was 300, it became 400
		
		
		//num = num -50; //350
		//^^^long way
		num -= 50;
		//^^^short way
		System.out.println(num); //350
		
		//num = num/7; //50
		//^^^long way
		num /= 7;
		System.out.println("After dividing by 7, it became "+num);
		
		//num = num *2; //100
		num *= 2;
		System.out.println("After multiplying by 2, it became "+num);
		
		//num = num % 9;
		num %= 9; 
		System.out.println("after moduling by 9, it became "+num);

	}

}
