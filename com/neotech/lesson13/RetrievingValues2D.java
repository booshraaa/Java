package com.neotech.lesson13;

public class RetrievingValues2D {
	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		// how many rows
		int rows = months.length;

		// how many columns we have in row 1
		int cols = months[1].length;

		System.out.println("Number of rows: " + rows + ", number of columns: " + cols);

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(months[row][col] + " ");
			}
			System.out.println();

		}

	}
}