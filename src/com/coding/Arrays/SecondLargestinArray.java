package com.coding.Arrays;

public class SecondLargestinArray {
	public static int secondLargestElement(int[] arr) {
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest && arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>secondLargest && arr[i]<largest) {
				secondLargest=arr[i];
			}
				
			
		}
		
		return secondLargest;
		
	}
	public static void main(String[] args) {
		int arr[]= {2 ,13, 4, 1, 3, 6, 28};
		System.out.println(secondLargestElement(arr));

	}

}
