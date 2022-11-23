package com.coding.String;

public class HighestOccuringCharacterXXX {

	public static void main(String[] args) {
		String str="abcdeapapqarrppppppp";
		System.out.println(highestOccuringCharacter(str));

	}

	private static char highestOccuringCharacter(String str) {
		
		int input[]= new int[256];
		
		for(int i=0;i<str.length();i++) {
			input[str.charAt(i)]++;
		}
		    int max = -1;  // Initialize max count
	        char result = ' ';   // Initialize result
	      
	        // Traversing through the string and maintaining
	        // the count of each character
	        for (int i = 0; i < str.length(); i++) {
	            if (max < input[str.charAt(i)]) {
	                max = input[str.charAt(i)];
	                result = str.charAt(i);
	            }
	        }
	      
		return result;
	}
}
