package com.coding.String;

public class CountWords {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Abhishek Kumar";
        System.out.println(getCount(str));
	}

	private static int getCount(String str) {
		// TODO Auto-generated method stub
		int count=1;
		if(str.length()==0)
			return 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		return count;
	}

}
