package com.coding.Pattern;
import java.util.Scanner;

/*Pattern for N = 4
4444
4444
4444
4444*/

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        int i=0;
        while(i<input) {
        	int j=0;
        	while(j<input) {
        		System.out.print(input);
        		j++;
        	}
        	i++;
        	System.out.println();
        }
        
//        for(int i=0;i<input;i++) {
//        	for(int j=0;j<input;j++) {
//        		System.out.print(input);
//        	}
//        	System.out.println();
//        }
	}

}
