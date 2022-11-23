package com.coding.TwoDArray;

public class RowWiseSum {

	public static void main(String[] args) {
		
        int arr[][]= {{1, 2},{3 ,4},{5, 6},{7, 8}};
        
        for(int i=0; i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
        rowWiseSum(arr);
        
	}
	
	public static void rowWiseSum(int[][] mat) {
				
		for(int i=0; i<mat.length;i++) {
			int sum=0;
        	for(int j=0;j<mat[i].length;j++) {
        		sum+=mat[i][j];
        	}
        	System.out.print(sum+" ");
        }
        
	}
	
	
	
	

}
