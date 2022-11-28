package com.neotech.lesson14;

public class Student {
	// features
	String firstname, lastname, school;
	int studentid;
	char gender, grade;

	// behaviors
	void study() {
		System.out.println(firstname + " " + lastname + "" + " is studying");
	}

	void hw() {
		System.out.println(firstname + " is doing homework");
	}

}
