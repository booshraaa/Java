package com.neotech.lesson04;

public class Recap {
	public static void main(String[] args) {
		
		int num1 = 10+10*10;
		System.out.println(num1);
		
		int num2 = (10 + 10) * 10;
		System.out.println(num2);
		
		int num3 = 10 * 10 + 10/10;
		System.out.println(num3);
		
		int num4 = 15;
		int num5 = 4;
		
		int div = num4 / num5;
		System.out.println("div is --> "+div);
		
		int rem = num4 % num5;
		System.out.println("rem is--> "+rem);
		
		int remainder = 19 % 6;
		System.out.println("remainder is --> "+remainder);
		
		int remainder2 = 8 % 4;
		System.out.println("remainder is--> "+remainder2);
		
		System.out.println("********************************");
		int a = 10;
		int b = 20;
		String x = "Java";
		String y = "Sunday";
		boolean z = true;
		
		System.out.println(x +" "+y); //(Java Sunday)
		System.out.println(x + y + a);//(JavaSunday10)
		System.out.println(x + z); //(Javatrue)
		
		System.out.println(x + y + a + b); //(JavaSunday1020)
		System.out.println(a + b + x + y); //(30JavaSunday)
		System.out.println(x + y + (a + b)); //(JavaSunday30)
		System.out.println("Java" + 10 + 2); //(Java102)
		System.out.println("Java "+(10 +2)); // (Java 12)
		System.out.println(a + "" + b + x + y); //(1020JavaSunday)
		System.out.println(a + (b + x + y)); // (1020JavaSunday)
		System.out.println("*********************");
		
		System.out.println(a + b +(x+y)); //(30JavaSunday)
		System.out.println(x + y + a * b); //(JavaSunday200)
		System.out.println("Mehmet" + 5); //(Mehmet5)
		System.out.println("mehmet" + 5 + 5); //(Mehmet55)
		System.out.println("Mehmet" + 5 * 5); //(Mehmet25)
		
		
		
		
		
		
		
				
				
			
		
		
		
	}

}
