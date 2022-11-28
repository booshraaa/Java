package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.HashSet;

public class Task {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("john");
		names.add("rick");
		names.add("tim");
		names.add("jasmine");
		names.add("rick");
		names.add("tim");

		System.out.println(names);

		HashSet<String> nms = new HashSet<>(names);
		System.out.println(nms);

	}

}
