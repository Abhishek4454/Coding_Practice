package com.coding.Pattern;

import java.util.Scanner;

//*
//*1*
//*121*
//*12321*
//*121*
//*1*
//*
public class HalfDiamondPatternXXX {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      pattern(sc.nextInt());
		
	}

	private static void  pattern(int n) {
		int i=1;
		System.out.println("*");
		while(i<=n) {
			int j=1;
			System.out.print("*");
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			j=1;
			while(i-j>0) {
				System.out.print(i-j);
				j++;
			}
			System.out.println("*");
			i++;
		}
		int k=n-1;//2
		i=1;
		while(i<=k) {
			int j=1;
			System.out.print("*");
			
			while(j<=k-i+1) {
				System.out.print(j);
				j++;
			}
			j=1;
			while(j<=k-i) {//j=4,k=4,i=1
				System.out.print(k-i+1-j);//k=2,i=1,j=1
				j++;
			}
			
			System.out.print("*");
			System.out.println();
			i++;
		}
		
		System.out.println("*");
	}

}
