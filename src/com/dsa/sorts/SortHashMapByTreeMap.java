package com.dsa.sorts;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByTreeMap {

	 public static void main(String[] args) {
		 
	        Map<String, Double> map = new HashMap<String, Double>();
	        ValueComparator bvc = new ValueComparator(map);
	        TreeMap<String, Double> sorted_map = new TreeMap<String, Double>(bvc);

	        map.put("C", 67.4);
	        map.put("A", 99.5);
	        map.put("B", 67.4);
	        map.put("D", 67.3);
	        map.put("E", 99.6);

	        System.out.println("unsorted map: " + map);
	        sorted_map.putAll(map);
	        System.out.println("results: " + sorted_map);
	        
	        //values can no longer be retrieved by their key. (get always returns null.)
	       System.out.println( sorted_map.get("A"));
	    }
	}

	class ValueComparator implements Comparator<String> {
	    Map<String, Double> base;

	    public ValueComparator(Map<String, Double> base) {
	        this.base = base;
	    }

	    // Note: this comparator imposes orderings that are inconsistent with
	    // equals.
	    public int compare(String a, String b) {
	      //return a.compareTo(b);
	    	if (base.get(a) >= base.get(b)) {
	            return -1;
	        } else {
	            return 1;
	        } // returning 0 would merge keys
	    }
	}