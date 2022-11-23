package com.coding.String;

public class CompressStringXXX {

	public static void main(String[] args) {
		
		String str="aaabbbbbbccccccdaaa";
		System.out.println(compressString(str));

	}

	private static String compressString(String str) {
		String result=str.charAt(0)+"";
		int count=1;
		
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			
			if(curr==prev)
				count++;
			else {
				if(count>1) {
					result+=count;
					count=1;
				}
				result+=curr;
			}
			
		}
		
		if(count>1) {
			result+=count;
			count=1;
		}
		return result;
	}

}
