package com.neotech.lesson19;

public class EmployeeWithinPackage {
	public static void main(String[] args) {

		Employee emp = new Employee();

		Employee.company = "Meth";
		emp.name = "Walter";
		emp.lastName = "White";
		emp.salary = 100.000;
		// you CANNOT see ssn

		emp.method1();
		emp.method2();
		emp.method3();
		// you CANNOT see method 4 for ssn

	}

}
