package com.neotech.lesson18;

public class Employee {
	int eID;
	double salary;

	static String CEO = "Elion";

	void printinfo() {
		System.out.println("Employee ID: " + eID + ", Employee salary: " + salary + ", CEO: " + CEO);

	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eID = 10;
		e1.salary = 80.000;
		e1.printinfo();

		Employee e2 = new Employee();
		e2.eID = 17;
		e2.salary = 100.000;
		e2.printinfo();

		Employee.CEO = "Ahmet";
		e1.printinfo();
		e2.printinfo();

	}

}
