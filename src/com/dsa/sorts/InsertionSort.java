package com.dsa.sorts;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

	public static void main(String[] args) {
		
		List<Integer> OrigList = new LinkedList<>();
		OrigList.add(5);
		OrigList.add(8);
		OrigList.add(2);
		OrigList.add(6);
		OrigList.add(1);

		List<Integer> newList = new LinkedList<>();
		
		origList : for(Integer num: OrigList){
			for(int in=0; in< newList.size(); in++){
				if(num < newList.get(in)){
					newList.add(in,num);
					continue origList;
				}
			}
			newList.add(newList.size(),num);
		}
		System.out.println(newList);
	}
}
