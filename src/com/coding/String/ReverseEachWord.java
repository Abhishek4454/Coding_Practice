package com.coding.String;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str="Hello I am Abhishek";
		System.out.println(reverseEachWord(str));
	}

	private static String reverseEachWord(String str) {
		// TODO Auto-generated method stub
		String result="";
		String splitStr[]=str.split(" ");
		for(int i=0;i<splitStr.length;i++) {
			for(int j=splitStr[i].length()-1;j>=0;j--) {
				result+=splitStr[i].charAt(j);
			}
			result+=" ";
		}
		return result;
	}

	
	
	
}
