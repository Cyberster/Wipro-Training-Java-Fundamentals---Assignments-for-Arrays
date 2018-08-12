package com.w3epic.wiprotraining;

public class Assignment3 {

	public static void main(String[] args) {
		int[] haystack = {5, 4, 3, 9, 1, 7, 9};
		int needle = 9;
		int index = -1;
		
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == needle) {
				index = i + 1;
				break;
			}
		}

		System.out.println(index);
	}

}
