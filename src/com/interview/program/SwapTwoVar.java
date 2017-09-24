package com.interview.program;

public class SwapTwoVar {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}

	public static void method1(){
		int x=10, y=5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after swaping : x= "+ x + "and y :"+y );
	}
	
	public static void method2(){
		int x=10, y=5;
		  x = x ^ y;    // x now becomes 15 (1111)
		  y = x ^ y;    // y becomes 10 (1010)
		  x = x ^ y;    // x becomes 5 (0101)
		System.out.println("after swaping : x= "+ x + "and y :"+y );
	}
	
	public static void method3(){
		int x=10, y=5;
		  x = x * y;    
		  y = x / y;    
		  x = x / y;    
		System.out.println("after swaping : x= "+ x + "and y :"+y );
	}
}
