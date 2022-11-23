package com.coding.Pattern;

import java.util.Scanner;

//for n=5
//1=1
//1+2=3
//1+2+3=6
//1+2+3+4=10
//1+2+3+4+5=15

public class SumPattern {

	public static void main(String[] args) {
	      Scanner sc= new Scanner(System.in);
	      pattern(sc.nextInt());
	  
	}

	private static void pattern(int n) {
		
	   int sum=0;
	   int i=1;
	   while(i<=n) {
		   int j=1;
		   while(j<=i) {
			   if(j==i) {
				   System.out.print(j+"=");
			   }else {
			   System.out.print(j+"+");
			   }
               
			   j++;
		   }
		   sum+=i;
		   System.out.print(sum);
		   System.out.println();
		   i++;
	   }
		
	}

}
