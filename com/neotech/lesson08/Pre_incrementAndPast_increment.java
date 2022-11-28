package com.neotech.lesson08;

public class Pre_incrementAndPast_increment {
	public static void main(String[] args) {
		
		// ++ increment
		// -- decrement 
		
		//pre increment
		// ++a
		
		//post increment
		//a++
		
		
		//pre decrement
		// --a
		
		//post decrement
		// a--
		
		int x ;
		
		int y = 10;
		
		x = y;
		
		//POST increment
		// 1. Performing x = y 
		// 2. Increment (y = y + y)
		 
		x = y++;
		System.out.println(x); //10
		System.out.println(y); //11
		
		System.out.println("*****************************");
		//PRE increment
		// 1. b = b + 1
		// 2. assign value of b to a 
		int a;
		int b = 15;
		
		a = ++b; 
		
		System.out.println(b);
		System.out.println(a);
		
		///////////////////////////////////////////////////
		System.out.println("******************************");
		////////////////////////////////////////////////////
		
		
		//PRE decrement 
		//1. first decrement the value of d
		//2. assign it to c
		//d -= 1
		//c = d
		
		int c;
		int d = 20; 
		
		c = --d;
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("******************************");
		//POST decrement
		//e = f
		//f = f-1
		
		int e;
		int f = 20;
		
		e = f--;
		
		System.out.println(e);
		System.out.println(f);
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
