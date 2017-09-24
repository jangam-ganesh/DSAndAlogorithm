package com.interview.program;

public class SecondLargest {


	public static void main(String[] args) {
		int[] input = new int[]{1,3,5,7,8,9};
		System.out.println(SecondLargest.getSecondLargest(input));
	}

	public static int getSecondLargest(int[] input){
		
		int firstLargest=0;
		int secondLargest=0;
		
		if(input[0] > input [1]){
			firstLargest = input[0];
			secondLargest = input[1];
		}else{
			firstLargest = input[1];
			secondLargest = input[0];
		}
		for(int i=2; i< input.length;i++){
			if(input[i] > firstLargest){
				secondLargest = firstLargest;
				firstLargest = input[i];
			}else if(input[i] < firstLargest && input[i] > secondLargest){
				secondLargest = input[i];
			}
		}
		return secondLargest;
	}
}
