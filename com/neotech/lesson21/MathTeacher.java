package com.neotech.lesson21;

public class MathTeacher extends Teacher {

	boolean SATprep;

	public void teachmath() {
		System.out.println(name + " tecahes math, fuck math fr fr");
	}

	public static void main(String[] args) {
		MathTeacher mt = new MathTeacher();
		mt.name = "Obama";
		mt.major = "quick maths";
		mt.SATprep = false;

		mt.teach();
		mt.teachmath();
	}

}
