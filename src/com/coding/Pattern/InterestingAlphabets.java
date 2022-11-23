package com.coding.Pattern;

import java.util.Scanner;

public class InterestingAlphabets {
//	Pattern for N = 5
	
//			E
//			DE
//			CDE
//			BCDE
//			ABCDE
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();
        int i=input;
        int counter=0;
        while(i>0) {
        	int j=0;
        	while(j<=i) {
        		System.out.print((char)('A'+i-j));
        		j++;
        		counter++;
        	}
        	i--;
        	System.out.println();
        }
	

	
	}

}
