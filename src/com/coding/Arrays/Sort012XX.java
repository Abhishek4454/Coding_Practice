package com.coding.Arrays;

import java.util.Arrays;

public class Sort012XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,0,1,2,2,0,0,1,1,2};
      // System.out.println(Arrays.toString(sort012(arr)));
       System.out.println(Arrays.toString(sort012WithoutTemp(arr)));

	}

	
	private static int[] sort012WithoutTemp(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
		int i=0;
		while(i<=end) {
			if(arr[i]==0) {
				int temp=arr[start];
				arr[start]=arr[i];
				arr[i]=temp;
				i++;
				start++;
			}
			else if(arr[i]==2) {
				int temp=arr[end];
				arr[end]=arr[i];
				arr[i]=temp;
				end--;
			}else {
				i++;
			}
		}
		
		return arr;
	}


	private static int[] sort012(int[] arr) {
		int temp[]=new int[arr.length];
		int start=0;
		int end=arr.length-1;
		int i=0;
//		for (int j = start+1; j < end; j++) {
//			temp[j]=1;
//		}
		while(start<=end && i<arr.length) {
			if(arr[i]==0) {
				temp[start]=0;
				i++;
				start++;
			}
			else if(arr[i]==2) {
				temp[end]=2;
				i++;
				end--;
			}else if(arr[i]==1) {
				i++;
			}
		}
		for (int j = start; j <= end; j++) {
			temp[j]=1;
		}
		return temp;
	}

}
