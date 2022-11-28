package com.neotech.lesson19;

public class Employee {
	public static String company; // public
	public String name;
	protected String lastName;
	double salary; // default, no access modifier
	private int ssn;

	// 1. if there's no access modifier, it's default
	// 2. the formula of assigning access modifier:
	// access modifier data type variable name

	public void method1() {
		System.out.println("I am a public method!!!");
	}

	protected void method2() {
		System.out.println("I am a protected method");
	}

	void method3() {
		System.out.println("I am a default method");
	}

	private void method4() {
		System.out.println("I am a private method");
	}

	public static void main(String[] args) {
		// we wanna see what elements we can access within the same class

		Employee emp = new Employee();
		//
		company = "Meth";
		emp.name = "Walter";
		emp.lastName = "White";
		emp.salary = 1000.000;
		emp.ssn = 222444;

		emp.method1(); // we can access public method
		emp.method2(); // we can access protected method
		emp.method3(); // we can access default method
		emp.method4(); // we can access private method as well

	}
}
