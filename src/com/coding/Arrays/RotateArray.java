package com.coding.Arrays;

import java.util.Arrays;

public class RotateArray {
	public static void rotate(int[] input,int d) {
		for (int i = 0; i < d; i++) {
			rotateByOne(input);
		}
		System.out.println(Arrays.toString(input));
	}
	private static void rotateByOne(int[] input) {
		int temp=input[0];
		for (int i = 1; i < input.length; i++) {
			input[i-1]=input[i];
		}
		input[input.length-1]=temp;
		
		
	}
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6, 7};//output=3 4 5 6 7 1 2
		rotate(arr, 2);

	}

}
