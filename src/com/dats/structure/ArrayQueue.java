package com.dats.structure;

public class ArrayQueue {

	final static int capacity = 3;
	int[] queue = new int[capacity];
	
	int size;
	int top=-1;
	int rear=0;
	
	public void enqueue(int elem){
		if(top < capacity-1){
			top++;
			queue[top] = elem;
			System.out.println("Message is pushed into queue..");
			display();
		}else{
			System.out.println("Queue Overflow");
		}
	}
	
	public int dequeue(){
		int elem =-1;
		if(top >= rear){
			elem = queue[rear++];
			System.out.println("Message is consumeed from queue: => "+elem);
			display();
		}else{
			System.out.println("Queue Underflow");
		}
		return elem;
	}
	
	public  void display(){
		if(top >= rear){
			for (int in=rear; in <= top; in++){
				System.out.println(queue[in]);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayQueue demo = new ArrayQueue();
		
		demo.dequeue();
		demo.enqueue(12);
		demo.enqueue(13);
		demo.enqueue(14);
		demo.enqueue(15);
		demo.dequeue();
		demo.dequeue();
		demo.dequeue();
		demo.dequeue();
	}

}
