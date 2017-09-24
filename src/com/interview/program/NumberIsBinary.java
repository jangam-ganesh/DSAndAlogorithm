package com.interview.program;

public class NumberIsBinary {

	public static void main(String[] args) {
		getBinary(156);
		System.out.println();
		System.out.printf("Number %d is binary ? %b %n",1001110,isBinary(1001110));
		System.out.printf("Number %d is binary ? %b %n",123,isBinary(123));
	}
	
	public static void getBinary(int num){
		int[] binary = new int[40];
		int index=0;
		while(num > 0){
			//System.out.println("num :"+num +" num%2 :" +num%2);
			binary[index++] = num % 2;
			num = num/2;
		}
	
		for (int i = index-1; i >=1; i--) {
			System.out.print(binary[i]);
		}
	}
	
	public static boolean isBinary(int number){
		while (number!=0){
			if(number%10 > 1){
				return false;
			}
			number = number /10;
		}
		return true;
	}

}
