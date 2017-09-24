package com.dats.structure;

public class LinkedListStack {

	public static void main(String[] args) {
		
		GenStack<Item> stack = new GenStack<Item>();

		stack.push(new Item(1,"Laptop","Dell series"));
		stack.push(new Item(2,"PC","Dell Desktop"));
		stack.push(new Item(3,"Tablet","Hp Tablet"));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
