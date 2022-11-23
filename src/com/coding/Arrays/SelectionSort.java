package com.coding.Arrays;

import java.util.Arrays;

public class SelectionSort {

	public static int[] selectionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {// After finding the minIndex and minimum value in array ,we need to swap the
								// minIndex value with the ith value of the array and also check if both the
								// index i.e i and minIndex is same or not
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
       return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 11, 10, 3, 15 };
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

}
