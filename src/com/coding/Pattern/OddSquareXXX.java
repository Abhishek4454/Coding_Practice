package com.coding.Pattern;

import java.util.Scanner;

//for n=5
//13579
//35791
//57913
//79135
//91357
public class OddSquareXXX {

	public static void main(String[] args) {
	      Scanner sc= new Scanner(System.in);
	      pattern(sc.nextInt());

	}
	

	private static void pattern(int n) {
		    int i = 1;
	        int maxOdd = 1+(n-1)*2;
	        int oddCount =0;
	        while(i<=n){
	            int j =1;
	            int odd=1;
	           	odd=odd+oddCount;
	            while(j<=n){
	                if(odd>maxOdd){
	                     odd=1;
	                }
	                System.out.print(odd);
	                odd=odd+2;
	                j=j+1;
	               
	            }
	            System.out.println();
	            i=i+1;
	            oddCount= oddCount+2;
	        }
		
	}


	private static void pattern1(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			int k=1;
			while(j<=n) {
				System.out.print(k);
				j++;
				k=k+2;
			}
			System.out.println();
			i++;
		}
		
	}

}
