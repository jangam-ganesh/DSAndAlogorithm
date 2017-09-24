package com.interview.program;

import com.interview.program.TestAbstract.test.test2;

public abstract class TestAbstract {

	public TestAbstract() {
	}
	
	 public abstract void getDetails();
	 
	 interface test{
		 void display();
		 
		 interface test2 extends test{
			 
		 }
	 }
	 
	
	 class Abc implements test2{
		@Override
		public void display() {
			// TODO Auto-generated method stub
			
		}	 
	 }
}
