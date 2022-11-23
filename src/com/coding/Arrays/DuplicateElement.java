package com.coding.Arrays;


public class DuplicateElement {
	 public static int findDuplicate(int[] arr){
		int duplicate=0;
		 for (int i = 0; i < arr.length; i++) {
			 int count=0;
			 for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j] && i!=j)
					count++;
				
			}
			 if(count>0)
				 duplicate=arr[i];
		}
		 return duplicate;
	 }
	public static void main(String[] args) {
		
		int arr[]= {0, 7, 2, 5, 4, 7, 1, 3, 6};
		System.out.println(findDuplicate(arr));

	}

}
