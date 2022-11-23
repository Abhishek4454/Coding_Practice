package com.coding.String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Abhishek";
		System.out.println(reverseString(str));

	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		String reverseString="";
		for (int i = str.length()-1; i >= 0; i--)
			reverseString+=str.charAt(i);

		return reverseString;
	}

}
