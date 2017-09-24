package com.design.pattern;

public class SingletonDemo {
	
	public static SingletonDemo instance;
	
	private SingletonDemo (){}	
	
	public static SingletonDemo getInstance(){
		
		if(instance == null){
			synchronized (SingletonDemo.class) {
				if(instance ==null){
					instance = new SingletonDemo();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		SingletonDemo.getInstance();
	}

}
