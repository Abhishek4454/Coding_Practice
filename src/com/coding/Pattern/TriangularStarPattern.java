package com.coding.Pattern;

import java.util.Scanner;

public class TriangularStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        int i=0;
        while(i<=input) {
        	int j=0;
        	while(j<i) {
        		System.out.print("*");
        		j++;
        	}
        	i++;
        	System.out.println();
        }
	}

}
