package com.dats.structure;

import java.util.LinkedList;

public class GenStack <E>{

	private LinkedList<E> stack = new LinkedList<E>();
	
	public void push(E elem){
		stack.addFirst(elem);
	}
	
	public E pop(){
		return stack.remove();
	}
	
}
