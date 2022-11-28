package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i <= 50; i = i + 2) {
			numbers.add(i);
		}

		// u can also use an if condition
		// if(i%2==0)

		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {
			Integer num = it.next();

			if (num % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
