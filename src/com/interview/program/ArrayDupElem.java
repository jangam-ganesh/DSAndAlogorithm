package com.interview.program;

import java.util.Arrays;

public class ArrayDupElem {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 5, 3, 4, 5, 2, 6, 7, 1};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(removeDuplicates(numbers)));
		System.out.println(Arrays.toString(removeDuplicates1(numbers)));
	}
	
	public static int[] removeDuplicates1(int[] input){
	        int i = 1;
	     	int j = 0;
	        
	        //return if the array length is less than 2
	        if(input.length < 2){
	            return input;
	        }
	        while(i < input.length){
	            if(input[i] == input[j]){
	                i++;
	            }else{
	                input[++j] = input[i++];
	            }   
	        }
	        int[] output = new int[j+1];
	        for(int k=0; k < output.length; k++){
	            output[k] = input[k];
	        }
	        return output;
	}
	
	public static int[]  removeDuplicates(int[] input){
		int[] result = new int[input.length];
		int previous = input[0];
		 result[0] = previous;
		for (int i = 1; i < input.length; i++) {
			int current = input[i];
			if(previous!=current){
				result[i] = current;
			}
			previous = current;
		}
		return result;
	}
}
