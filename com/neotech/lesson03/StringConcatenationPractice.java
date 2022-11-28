package com.neotech.lesson03;

public class StringConcatenationPractice {
	
	public static void main(String[] args) {
		
		String language = "Java";
		// I love java class!
		System.out.println("I love " + language + " class!");
		
		String s1 = "I love ";
		String s2 = " class!";
		System.out.println(s1 + language + s2);
		
		//if you want spacing to show, put it inside the ""
		
		String s3 = "I have " + 2;
		String s4 = s3 + 4;
		String two = "2";
		String four = "4";
		
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(two + four);
		System.out.println(2 + 4);
		
		//order of operations ^^^
		// for short, int, byte = (2+2=4)
		//for "strings" = (2+2=22)
		//for string + number = ("2" + 2="22")
		
		// strings CANNOT be added together, they are concatenated
		// integers are added together
		
		System.out.println("I have " + 2 + 4 + " apples");
		System.out.println("I have " + (2 + 4) + " apples");
		//These are different^^^
		
		System.out.println(4 + 3); //=7
		System.out.println("4" + 3); //=43
		System.out.println("4" + "3"); //=43
		System.out.println('4' + '3'); // ???
		
		System.out.println(4 * 7); //=28
		System.out.println(4 - 7); //-3
		
		System.out.println("4+3\n4+3 "); //4+3
		                                //4+3
		
	//           TASK             //
		String name = "Mary ";
		String lastName = "Jane";
		int grade = 12; 
		String city = "chicago";
		String state = "Illinois";
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		
	//what if i wanna print them in one sentence???
		
		System.out.println(name+" "+lastName+" "+grade+" "+city+" "+state);
		
		System.out.print(name);
		System.out.print( lastName);
		
		
		
	
	}

}
