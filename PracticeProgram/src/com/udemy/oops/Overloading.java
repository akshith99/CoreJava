package com.udemy.oops;

public class Overloading {

	//two parameters
	int findMax(int a, int b) {
		
		int max;
		if(a>b) max = a;
		else max = b;
		return max;
			
	}
	
	//three parameters
	int findMax(int a, int b, int c) {
			
			int max;
			if(a>b && a>c) max = a;
			else if(b>a && b>c) max = b;
			else max =c;
			return max;
				
		}
}

class OverloadMain {
	
	public static void main(String[] args) {
		
		Overloading m = new Overloading();
		int result = m.findMax(7, 4);
		System.out.println("Maximum value: " + result);
		int result2 = m.findMax(100, 23, 78);
		
		System.out.println("Maximum value: " + result2);
	}
	
	
	
}
