package com.coding.Arrays;

import java.util.Arrays;

//Sample Input 1:
//1
//7
//2 0 0 1 3 0 0
//Sample Output 1:
//2 1 3 0 0 0 0
public class PushZerostoEnd {

	public static void main(String[] args) {
		int arr[]= {2, 0, 0, 1, 3, 0, 0};
		pushZerosAtEnd(arr);

	}

	public static void pushZerosAtEnd(int[] arr) {

		// Using temp array
//		 int temp[]=new int[arr.length];
//		 int k=0;
//		 for (int i = 0; i < arr.length; i++) {
//			if(arr[i]!=0)
//			{
//				temp[k]=arr[i];
//				k++;
//			}
//		}
//		 
//		 System.out.println(Arrays.toString(temp));

		// Without using temp array but in two loops
		// Count of non-zero elements
//		int count = 0;
//		int n = arr.length;
//		// Traverse the array. If arr[i] is non-zero, then
//		// update the value of arr at index count to arr[i]
//		for (int i = 0; i < n; i++)
//			if (arr[i] != 0)
//				arr[count++] = arr[i];
//
//		// Update all elements at index >=count with value 0
//		for (int i = count; i < n; i++)
//			arr[i] = 0;
//
//		System.out.println(Arrays.toString(arr));

		// Without Using temp array and in one pass
		int count = 0;
		for (int i = 0; i < arr.length; i++) {//2, 0, 0, 1, 3, 0, 0
			if(arr[i]!=0) {
				swap(arr,count,i);
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int count, int i) {
		// TODO Auto-generated method stub
		if(count!=i) {
			int temp=arr[count];
			arr[count]=arr[i];
			arr[i]=temp;
		}
		
	}

}
