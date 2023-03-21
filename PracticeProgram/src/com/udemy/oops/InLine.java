package com.udemy.oops;


class A {
	
	final static void method() {
		System.out.println("Hello");
	}
}

class B {
	
	void method2() {
		A.method();
	}
}

public class InLine {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.method2();
	}
}
