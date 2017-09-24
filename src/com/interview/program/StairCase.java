package com.interview.program;

public class StairCase {

	public static void main(String[] args) {
		StairCase.printStairCase(10);
	}

	public static void printStairCase(int n){
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n;j++){
				if((i+j)>n){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
