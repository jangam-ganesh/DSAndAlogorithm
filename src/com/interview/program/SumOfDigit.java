package com.interview.program;

public class SumOfDigit {

	public static void main(String[] args) {
		System.out.println(getSumOfDigits(421));
	}
	
	public static int getSumOfDigits(int num){
		int sum =0;
		while (num!=0){
			sum = sum+num%10;
			num = num/10;
		}
		return sum;
	}
}
