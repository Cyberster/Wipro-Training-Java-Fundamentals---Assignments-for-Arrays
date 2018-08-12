package com.w3epic.wiprotraining;

public class Assignment11 {

	public static void main(String[] args) {
		if (args.length != 9)
			System.out.println("Please enter 9 integer numbers");

		int[][] array = new int[3][3];
		int x = 0;

		// storing input to 2d array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(args[x++]);
			}
		}
		
		int max = 0;
		
		// getting max of array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				max = array[i][j] > max ? array[i][j] : max;
			}
		}
			
		System.out.println("The biggest number in the given array is " + max);
		
	}

}
