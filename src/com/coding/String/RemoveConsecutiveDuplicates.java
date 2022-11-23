package com.coding.String;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		String str="aaabbbbcccccccd";
		System.out.println(removeConsecutiveDuplicates(str));

	}

	private static String removeConsecutiveDuplicates(String str) {
		String result="";
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1)==str.charAt(i))
				continue;
			else
				result+=str.charAt(i-1);
		}
		
		return result+str.charAt(str.length()-1);
	}

}
