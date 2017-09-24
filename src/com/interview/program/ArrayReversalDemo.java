package com.interview.program;

import java.util.Arrays;

public class ArrayReversalDemo {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(numbers));
		reverse(numbers); 
		System.out.println(Arrays.toString(numbers));
	}
	
	public  static void reverse(int[] input){
		for(int i = 0 ; i<=input.length/2; i++){
			int tmp = input[i];
			input[i] = input[input.length-1-i];
			input[input.length-1-i] = tmp;
		}
	}
}
