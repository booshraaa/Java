package com.neotech.lesson23;

public class Degree2 {
	public static void main(String[] args) {

		Degree d = new Degree();
		d.getPrerequisite();

		Bachelors b = new Bachelors();
		b.Bachelor();

		Masters m = new Masters();
		m.getPrerequisite();
	}
}
