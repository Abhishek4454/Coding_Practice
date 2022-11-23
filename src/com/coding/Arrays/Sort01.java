package com.coding.Arrays;

import java.util.Arrays;

public class Sort01 {

	public static void main(String[] args) {
		int arr[]= {0 ,1 ,1 ,0 ,1 ,0 ,1};
		sortArray(arr);

	}
    //using extra Array---Not recomended
//	private static void sortArray(int[] arr) {
//		int start=0;
//		int output[]=new int[arr.length];
//		int end=arr.length-1;
//		int i=0;
//		while(start<=end) {
//			if(arr[i]==0)
//			{
//				output[start]=0;
//				start++;
//			}else if(arr[i]==1){
//				output[end]=1;
//				end--;
//			}
//			i++;
//				
//		}
//		
//		System.out.println(Arrays.toString(output));
//		
//	}

	private static void sortArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			if(arr[start]==0) {
				start++;
				continue;
			}
			if(arr[end]==1) {
				end--;
				continue;
			}
			if(arr[start]==1 && arr[end]==0) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
