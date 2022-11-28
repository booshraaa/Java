package com.neotech.lesson17;

public class Task2 {
	public static void main(String[] args) {
		// (\, ?, n, t) have a special meaning in java. (\\?)

		String sentence = "Is it saturday?Is it raining?Do we have a Java class today?";
		String[] sentence1 = sentence.split("\\?");

		System.out.println("Array length is: " + sentence1.length);

		String sentence2 = sentence.replaceAll("[?]", "+");
		System.out.println(sentence2);

		for (String word : sentence1) {
			System.out.println(word);
		}

		String sentence3 = "is it saturday! is it raining? do we have a java class today.";
		String[] sentence4 = sentence3.split("[!?.]");

	}

}
