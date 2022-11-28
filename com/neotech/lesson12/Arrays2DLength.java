package com.neotech.lesson12;

public class Arrays2DLength {
	public static void main(String[] args) {

		String[][] months = { { "dec", "Jan", "Feb" }, { "Mar", "Apr", "May" }, { "June", "July", "Aug" },
				{ "Sep", "Oct", "November" }, };

		int rowCount = months.length;
		System.out.println("Total of " + months.length + "rows");

		int lengthRowIndex = months[1].length;
		System.out.println("Row index 1 has " + lengthRowIndex + " columns");

	}

}
