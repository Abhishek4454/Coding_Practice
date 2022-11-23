package com.coding.Pattern;

import java.util.Scanner;

/*
 * Pattern for N = 4
1
21
321
4321
*/
public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        int i=1;
        while(i<=input) {
        	int j=0;
        	while(j<i) {
        		System.out.print(i-j);
        		j++;
        	}
        	i++;
        	System.out.println();
        }
	}

}
