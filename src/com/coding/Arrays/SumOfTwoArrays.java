package com.coding.Arrays;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int arr1[]= {9,8,7,6,9};
		int arr2[]= {5,8,3,1,5};
		
		int output[]=addArray(arr1,arr2);
		System.out.println(Arrays.toString(output));


	}

	private static int[] addArray(int[] arr1, int[] arr2) {
		
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=Math.max(arr1.length, arr2.length);
		
		int output[]=new int[k+1];
		int carry=0;
		
		while(i>=0 && j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			i--;
			k--;
			j--;
		}
		
		while(i>=0) {
			int sum=arr1[i]+carry;
			output[k]=sum%10;
			carry=sum/10;
			i--;
			k--;
			
		}
		while(j>=0) {
			int sum=arr2[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			k--;
			j--;
		}
		
		output[0]=carry;
		
		return output;
	}

}
