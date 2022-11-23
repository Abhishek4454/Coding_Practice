package com.coding.String;

public class ReverseStringWordwise {

	public static void main(String[] args) {
        reversStringWordWise("Welcome to Coding Ninjas");
	}

	private static void reversStringWordWise(String sentence) {
		
		String[] splitWord=sentence.split(" ");
		
        for(int i=splitWord.length-1;i>=0;i--)
        	System.out.print(splitWord[i]+" ");
		
		
	}

}
