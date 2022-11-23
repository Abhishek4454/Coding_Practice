package com.coding.TwoDArray;

public class PrintSpiralXXX {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][]= {{1 , 2 , 3,  4 },{5,  6 , 7 , 8},{9 ,10, 11, 12},{13 ,14, 15 ,16}};
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+ "  ");
		}
		System.out.println();
	}
       
       printSpiral(arr);

}

	private static void printSpiral(int[][] arr) {
		System.out.println("=============");
		
		int rows=arr.length;
		int col=arr[0].length;
		int minRows=0,minCol=0,count=0;
		int tCount=rows*col;
		
		while(count<tCount) {
			//top wall  here rows is contant
			for(int i = minCol;i<col && count<tCount ;i++) {
				System.out.print(arr[minRows][i]+" ");
				count++;
			}
			minRows++;
			//Right here col is constant
			for(int i = minRows;i<rows && count<tCount;i++) {
				System.out.print(arr[i][col-1]+" ");
				count++;
			}
			col--;
			
			//Bottom wall here rows is constant
			for(int i = col-1;i>=minCol && count<tCount;i--) {
				System.out.print(arr[rows-1][i]+" ");
				count++;
			}
			rows--;
			//Left wall
			for(int i = rows-1;i>=minRows && count<tCount;i--) {
				System.out.print(arr[i][minCol]+" ");
				count++;
			}
			minCol++;
		}
		    
		
	}
			
}

