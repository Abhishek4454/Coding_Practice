package com.coding.String;

public class PermutationCheck {

	public static void main(String[] args) {
		
		String str1="aba";
		String str2="bab";
		
	   System.out.println(ifPermutation(str1,str2));
		

	}

	private static boolean ifPermutation(String str1, String str2) {
		
		boolean ifPermutation=true;
		//int count=0;
		int arr[]=new int[256];
		
		for(int i=0;i<str1.length();i++) {
			arr[str1.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++) {
			arr[str2.charAt(i)]--;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				ifPermutation=false;
		}
		return ifPermutation;
	}

}
