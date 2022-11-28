package com.neotech.lesson14;

public class School {
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Cars c1 = new Cars();

		System.out.println("----student 1----");
		s1.firstname = "hoes";
		s1.lastname = "mad";
		s1.school = "school of life";
		s1.studentid = 444;
		s1.gender = '?';
		s1.grade = 'A';

		s1.hw();
		s1.study();

		System.out.println("---student 2----");
		/////////////////////////////////
		s2.firstname = "kanye";
		s2.lastname = "tate";
		s2.school = "gangster's paradise";
		s2.studentid = 777;
		s2.gender = 'M';
		s2.grade = 'D';

		s2.hw();
		s2.study();

	}

}
