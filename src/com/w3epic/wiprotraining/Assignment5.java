package com.w3epic.wiprotraining;

import java.util.Arrays;

public class Assignment5 {

	public static void main(String[] args) {
		int[] array = {48, 55, 68, 88, 101, 122};
		
//		// sorting in ASC order using bubble sort
//		for (int i = 0; i < array.length - 1; i++) {
//			for (int j = 0; j < array.length - i - 1; j++) {
//				if (array[j] > array[j + 1]) {
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
		
		Arrays.sort(array);
		
		System.out.println("Smallest two in the array: " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array: " + array[array.length-1] + " and " + array[array.length-2]);
	}

}
