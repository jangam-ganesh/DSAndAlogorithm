package com.interview.program;

public class ReverseString {
	
	public static void main(String[] args) {
		String str= "Hello Ganesh";
		System.out.println(str.length());
		
		for (int i=str.length()-1; i>= 0; i--){
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		char[] charArr = str.toCharArray();
		
		for (int i = charArr.length-1; i >=0; i--) {
			System.out.print(charArr[i]);
		}
	}

}
