package com.udemy.interfaces;

public class A {

	public interface NestedIf {
		
		boolean isNotNegative(int x);
		
	}
	
	
}

class B implements A.NestedIf {

	@Override
	public boolean isNotNegative(int x) {

		return x < 0 ? false : true;
	}
	
}

class NestedIfDemo {
	
	public static void main(String[] args) {
		
		A.NestedIf nif = new B();
		
		if(nif.isNotNegative(3)) {
			System.out.println("The number is not negative");
		} else {
			System.out.println("The number is negative");
		}
	}
}


