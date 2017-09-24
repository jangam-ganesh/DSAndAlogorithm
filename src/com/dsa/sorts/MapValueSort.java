package com.dsa.sorts;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapValueSort {

	public static void main(String[] args) {
		
		Random random = new Random();
        Map<String, Integer> testMap = new HashMap<String, Integer>(10);
        for(int i = 0 ; i < 10 ; ++i) {
            testMap.put( "key" + i, random.nextInt(10));
        }
        
        System.out.println("unsorted map: " + testMap);
        testMap = MapValueSort.sortByValue( testMap );
        System.out.println("results: " + testMap);
       
	}
	
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
}
