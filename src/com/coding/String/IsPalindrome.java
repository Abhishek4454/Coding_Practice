package com.coding.String;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcba";
		System.out.println(isPalindrome(str));
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		String reverseString="";
		for (int i = str.length()-1; i >= 0; i--)
			reverseString+=str.charAt(i);
		
		return reverseString.equals(str);
	}

}
