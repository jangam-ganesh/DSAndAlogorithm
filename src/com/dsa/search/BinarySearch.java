package com.dsa.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		
		BinarySearch search = new BinarySearch();
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(20);
		list.add(30);
		list.add(34);
		list.add(40);
		list.add(50);
		
		System.out.println(search.binarySearch(list, 34));
	}
	
	public boolean binarySearch(List<Integer> list, Integer num){
		
		if(null ==list  || list.isEmpty()){
			return false;
		}
		
		Integer compare = list.get(list.size()/2);
		
		if(compare.equals(num)){
			return true;
		}
		
		if(num < compare){
			return binarySearch(list.subList(0, list.size()/2), num);
		}else{
			return binarySearch(list.subList(list.size()/2+1,list.size()), num);
		}
		
	}

}
