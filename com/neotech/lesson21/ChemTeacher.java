package com.neotech.lesson21;

public class ChemTeacher extends Teacher {
	boolean APchem;

	public void cooksmeth() {
		System.out.println(name + " cooks crystal meth");
	}

	public static void main(String[] args) {
		ChemTeacher ct = new ChemTeacher();
		ct.name = "Walter White";
		ct.major = "metamphetamines";
		ct.APchem = true; // comes from current class

		ct.teach();
		ct.cooksmeth();
	}

}
