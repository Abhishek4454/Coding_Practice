package com.coding.Pattern;

import java.util.Scanner;

/*Pattern for N = 4
A
BC
CDE
DEFG*/
public class CharacterPattern {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();
        int i=0;
        while(i<input) {
        	int j=0;
        	while(j<=i) {
        		System.out.print((char)('A'+j+i));
        		j++;
        	}
        	i++;
        	System.out.println();
        }
	

	}

}
