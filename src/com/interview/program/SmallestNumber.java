package com.interview.program;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] input = new int[]{1,3,5,7,8,9,0};
		System.out.println(SmallestNumber.getSmallest(input));
	}

	public static int getSmallest(int[] input){
		
		int smallest= input[0];
		
		for(int i=1; i< input.length;i++){
			if(smallest > input[i]){
				smallest = input[i];
			}
		}
		return smallest;
	}
}