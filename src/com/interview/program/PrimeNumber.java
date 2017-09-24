package com.interview.program;

public class PrimeNumber {

	public static void main(String[] args) {

		int[] input = new int[] { 12, 34, 12, 7, 9, 13, 1, 17, 19, 15 };
		for (int in = 0; in < input.length; in++) {
			System.out.println("Number " + input[in] + " is prime ? " + PrimeNumber.isPrimeNumber(input[in]));
		}

	}

	public static boolean isPrimeNumber(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
