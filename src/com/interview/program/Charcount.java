package com.interview.program;

import java.util.HashMap;
import java.util.Map;

public class Charcount {

	public static void main(String[] args) {
		System.out.println(Charcount.getNonRep("GeeksforGeeks".toCharArray()));
		Charcount.dispayCharCount("ganeshjangam".toCharArray());
	}
	
   public static char getNonRep(char[] arr){
	  char[] count = new char[256];
	  for( int i=0; i<arr.length; ++i){
		  count[arr[i]]++;
	  }
	  
	  //First non repeating character
	  for(int i=0;i<arr.length;++i){
		  System.out.println("Char is "+arr[i] +" Count is : "+ (count[arr[i]]));
		  if(count[arr[i]]==1)
			  return arr[i];
	  }
	  
	  //Second non repeating character
	  /*int second =0;
	  for(int i=0;i<arr.length;++i){
		  if(count[arr[i]]==1){
			  second++;
			  if(second ==2)
			  return arr[i];
		  }
	  }*/
	  
	  //Last non repeating character
	 /* for(int i=arr.length-1; i>1; --i)
	  {
		  if(count[arr[i]]==1)
			  return arr[i];
	  }*/
	    return (char) ' ';
   }
   

   public static void dispayCharCount(char[] input){
	    Map<Character, Integer> charCount = new HashMap<Character,Integer>();
	    for(char c : input){
	      if(charCount.containsKey(c)){
	        charCount.put(c, charCount.get(c)+1);
	      }else{
	        charCount.put(c, 1);
	      }
	    } 
	    System.out.println(charCount);
	  }
}

