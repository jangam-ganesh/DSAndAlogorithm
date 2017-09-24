package com.dats.structure;

import java.util.LinkedList;

public class GenQueue<E> {

	private LinkedList<E> queue = new LinkedList<E>();
	
	public void enqueue(E elem){
		queue.addLast(elem);
	}

	public E dequeue(){
		return queue.poll();
	}
}
