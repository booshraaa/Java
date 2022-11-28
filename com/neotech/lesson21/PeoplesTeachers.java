package com.neotech.lesson21;

public class PeoplesTeachers extends Teacher {

	public void teachespeople() {
		System.out.println(name + " teaches facts only");
	}

	public void people() {
		System.out.println(name + " once said; ~men should always pay~");
	}

	public static void main(String[] args) {
		PeoplesTeachers pt = new PeoplesTeachers();
		pt.name = "Andrew Tate";
		pt.gender = 'M';
		pt.major = "Life";

		pt.teach();
		pt.teachespeople();
		pt.people();
	}

}
