package com.coding.Arrays;

public class LinearSearch {
	public static int linearSearch(int arr[], int x) {
		int i;
		for ( i = 0; i < arr.length; i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
	  int arr[]= {2, 13, 4, 1 ,3, 6, 28};
       System.out.println(linearSearch(arr, 3));
	}

}
