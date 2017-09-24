package com.dats.structure;

public class LinkedListQueue {

	public static void main(String[] args) {
		
		GenQueue<Item> queue = new GenQueue<Item>();
		
		queue.enqueue(new Item(1,"Laptop","Dell series"));
		queue.enqueue(new Item(2,"PC","Dell Desktop"));
		queue.enqueue(new Item(3,"Tablet","Hp Tablet"));
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
