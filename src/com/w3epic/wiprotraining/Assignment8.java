package com.w3epic.wiprotraining;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		int[] array = {12, 34, 12, 45, 67, 89};
		
		int maxElement = getMostFrequentItem(array);
		
		System.out.println(maxElement);
	}
	
	public static int getMostFrequentItem(int[] array) {
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		
		// initializing hashmap
		for (int i = 0; i < array.length; i++)
			freqMap.put(array[i], 0);
		
		// storing frequency into map
		for (int i = 0; i < array.length; i++) {
			freqMap.put(array[i], freqMap.get(array[i]) + 1);
		}
		
		int maxKey = (int) freqMap.keySet().toArray()[0];
		
		for (int key : freqMap.keySet()) {
			if (freqMap.get(key).intValue() > freqMap.get(maxKey).intValue())
				maxKey = key;
		}
		
		return maxKey;
	}

}
