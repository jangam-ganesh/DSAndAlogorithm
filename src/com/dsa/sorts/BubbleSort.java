package com.dsa.sorts;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = new int[]{8,1,7,2,9,3,5,4,0};
		for(int out = arr.length-1; out > 0; out--){
			for(int in = 0; in < out; in++){
				if(arr[in] > arr [in+1]){
					int tmp = arr[in];
					arr[in] = arr[in+1];
					arr[in+1]= tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
