package com.coding.Pattern;

import java.util.Scanner;

//For N = 3
//***
//***
// ***


public class ParallelogramPattern {

	public static void main(String[] args) {
	      Scanner sc= new Scanner(System.in);
	      pattern(sc.nextInt());
			
		}

	private static void pattern(int n) {
		
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n) {
			System.out.print("*");
			j++;
			}
			System.out.println();
			i++;
		}
	}

}
