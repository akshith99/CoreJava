package com.udemy.interfaces;

public interface Greetings {

	void greetings();
	
}

abstract class Sample implements Greetings {
	
	int a = 10, b = 10;
	
	
	void sum() {
		System.out.println(a+b);
	}
}

class MainMethodOne {
	
	public static void main(String[] args) {
		
		Sample s = new Sample() {

			@Override
			public void greetings() {
				
				System.out.println("Happy new year");
				
			}
		};
		
		s.greetings();
		s.sum();
		
	}
}
