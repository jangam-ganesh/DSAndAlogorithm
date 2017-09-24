package com.interview.program;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println(isArmStrong(153));
		System.out.println(isArmStrong(371));
		System.out.println(isArmStrong(567));
	}

	/* * @return true if number is Armstrong number or return false */
	private static boolean isArmStrong(int number) {
		int result = 0;
		int orig = number;
		while (number != 0) {
			int remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}
		// number is Armstrong return true
		if (orig == result) {
			return true;
		}
		return false;
	}
}
