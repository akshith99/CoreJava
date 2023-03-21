package com.udemy.string;

public class RemoveDouble {

	
	public static String removeDoublefromString(String s) {
		
		String str = new String();
		
		int len = s.length();
		
		for(int i = 0; i < len; i++) {
			
			char c = s.charAt(i);
			
			// if c is present in str, it returns
            // the index of c, else it returns -1
			if(str.indexOf(c) < 0) {
				str += c;
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		String s = "Bookkeeper";
		System.out.println(removeDoublefromString(s));
		
	}
	
}
