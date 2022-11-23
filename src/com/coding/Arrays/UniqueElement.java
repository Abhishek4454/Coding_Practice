package com.coding.Arrays;


public class UniqueElement {
	 public static int findUnique(int[] arr){
		int unique=0;
		 for (int i = 0; i < arr.length; i++) {
			 int count=0;
			 for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j] && i!=j)
					count++;
				
			}
			 if(count==0)
				 unique=arr[i];
		}
		 return unique;
	 }
	public static void main(String[] args) {
		
		int arr[]= {2, 3, 1, 6, 3, 6, 2};
		System.out.println(findUnique(arr));

	}

}
