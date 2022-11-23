package com.coding.Arrays;

public class BinarySearch {
	 public static int binarySearch(int[] input, int x) {
		 int start =0;
		 int end=input.length-1;
		 int mid=(start+end)/2;
		 while(start<=end) {
			 if(x==input[mid])
				 return mid;
			 if(x>mid)
			 {
				 start=mid+1;
				 mid=(start+end)/2;
				 start++;
			 }
			 if(x<mid)
			 {
				 end=mid-1;
				 mid=(start+end)/2;
				 end--;
			 }
		 }
		 
		 return -1;
	 }
	public static void main(String[] args) {
		int arr[]= {1 ,3 ,7 ,9 ,11 ,12 ,45};
        System.out.println(binarySearch(arr, 12));		

	}

}
