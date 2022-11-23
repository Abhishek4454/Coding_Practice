package com.coding.Arrays;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int arr1[]= {2,3,8,10,11};
		int arr2[]= {5,8,11,15,23,27};
        System.out.println(Arrays.toString(mergeSortedArray(arr1,arr2)));
	}

	private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		int sortedArray[]= new int[arr1.length+arr2.length];
		int k=0;
		int i=0,j=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				sortedArray[k]=arr2[j];
				j++;
				k++;
			}
			else {
				sortedArray[k]=arr1[i];
				i++;
				k++;
			}
		}
		while(i<arr1.length) {
			sortedArray[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			sortedArray[k]=arr2[j];
			j++;
			k++;
		}
		return sortedArray;
	
//	 int i = 0, j = 0, k = 0;
//	 int n1 = arr1.length;
//	 int n2 = arr2.length;
//	 int arr3[]= new int[arr1.length+arr2.length];
//        // Traverse both array
//        while (i<n1 && j <n2)
//        {
//            // Check if current element of first
//            // array is smaller than current element
//            // of second array. If yes, store first
//            // array element and increment first array
//            // index. Otherwise do same with second array
//            if (arr1[i] < arr2[j])
//                arr3[k++] = arr1[i++];
//            else
//                arr3[k++] = arr2[j++];
//        }
//     
//        // Store remaining elements of first array
//        while (i < n1)
//            arr3[k++] = arr1[i++];
//     
//        // Store remaining elements of second array
//        while (j < n2)
//            arr3[k++] = arr2[j++];

//	return arr3;

	}

}
