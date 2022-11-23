package com.coding.Arrays;

import java.util.Arrays;

public class InsertionSort {

	public static int[] bubleSort(int arr[]) {
        
		for (int i = 1; i < arr.length; i++) {//will assume that the first index i.e i=0 is already sorted
			int j=i-1;//will keep the first index in j in order to compare
			int temp=arr[i];//will store the value of first index
			while(j>=0 && arr[j]>temp) {//check if first index is greater that second untill we reach the start
				arr[j+1]=arr[j];
				j--;//keep decrementing
			}
			arr[j+1]=temp;//replace the second index with the first
		}
		
       return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 11, 10, 3, 15 };
		System.out.println(Arrays.toString(bubleSort(arr)));
	}

}
