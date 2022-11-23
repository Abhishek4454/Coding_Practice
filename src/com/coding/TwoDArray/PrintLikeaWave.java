package com.coding.TwoDArray;

public class PrintLikeaWave {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][]= {{1 , 2 , 3,  4 },{5,  6 , 7 , 8},{9 ,10, 11, 12}};
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
	}
       
       printLikeWave(arr);

}

	private static void printLikeWave(int[][] arr) {
		int rows=arr.length;
		int col=arr[0].length;
		
		for(int i=0;i<col;i++ ) {
			if(i%2==0) {
			for(int j=0;j<rows;j++) {
				System.out.print(arr[j][i] +" ");
			}
		}
			else {
				for(int j=rows-1;j>=0;j--) {
					System.out.print(arr[j][i] +" ");
				}
			}
	}
			
}
}
