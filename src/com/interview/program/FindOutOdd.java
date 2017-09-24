package com.interview.program;

public class FindOutOdd {

	public static void main(String[] args) {
		int[] input = new int[]{1,3,5,7,8,9};
		for (int i = 0; i < input.length; i++) {
			if( i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
