package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet<String> breakfast = new HashSet<>();

		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("cheese");
		breakfast.add("avocado");
		breakfast.add("avocado");

		int size = breakfast.size();
		System.out.println("The size is " + size);
		// size is 4 bd it doesn't count the duplicate avocado

		// get all elements using for each loop
		for (String items : breakfast) {
			System.out.print(items + " ");
		}
		System.out.println();

		Iterator<String> it = breakfast.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

	}

}
