package com.interview.program;

import java.util.ArrayList;
import java.util.List;

public class FindCommonsElem {

	public static void main(String[] args) {
		//First solutions is use retailAll method.
		//Second solution is use == then only add into set
		
		List<String> firstList = new ArrayList<String>();
		firstList.add("white");
		firstList.add("green");
		firstList.add("red");
		firstList.add("orange");
		
		List<String> secondList = new ArrayList<String>();
		secondList.add("black");
		secondList.add("blue");
		secondList.add("white");
		secondList.add("green");
		
		System.out.println(firstList.retainAll(secondList));
		
		for(String str: firstList)
			System.out.println(str);
	}

}
