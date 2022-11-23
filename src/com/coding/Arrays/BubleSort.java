package com.coding.Arrays;

import java.util.Arrays;

public class BubleSort {

	public static int[] bubleSort(int arr[]) {
        
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				  if(arr[i]>arr[j]) {
					  int temp=arr[i];
					  arr[i]=arr[j];
					  arr[j]=temp;
				  }
			}
		}
		
       return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 11, 10, 3, 15 };
		System.out.println(Arrays.toString(bubleSort(arr)));
	}

}
