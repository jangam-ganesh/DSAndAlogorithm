package com.dsa.sorts;

public class SelectionSort {

	public static void main(String[] args) {
		int input[] = new int[]{8,1,7,2,9,3,5,4,0};	
		
		for(int out =0 ; out < input.length-1; out++){
		     int min = out;
		      for(int in = out+1; in < input.length; in++ ){
		        if(input[in] < input[min]){
		          min = in;
		        }
		      }
		          int tmp = input[out];
		          input[out] = input[min];
		          input[min] = tmp;
		    }
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] +" ");
		}
	}
}
