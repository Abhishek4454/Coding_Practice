package com.coding.Arrays;

import java.util.Arrays;

public class ArrayIntersection {
	public static void intersections(int arr1[], int arr2[]) {
		//int arr[]= new int[arr1.length];
		//int k=0;
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j])
				{
					
					//arr[k]=arr1[i];
					System.out.print(arr1[i]+" ");
					arr2[j]=Integer.MIN_VALUE;
					//k++;
					break;
				}
			}
		}
		
		//System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[]= {2, 6 ,8 ,5 ,4 ,3};
        int arr2[]=	{2, 3 ,4 ,7 };
        
        intersections(arr1, arr2);
	}

}
