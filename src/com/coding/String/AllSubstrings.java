package com.coding.String;

public class AllSubstrings {
    
	public static void main(String[] args) {
		String str="pqrs";
		getAllSubstring(str);

	}

	private static void getAllSubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.print(str.substring(i, j)+" ");
			}
		}
		
	}

}
