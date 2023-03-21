package com.udemy.abstraction;

public abstract class MyClass {
	
	abstract void calculate(int a);
	
	public void Start() {
		System.out.println("START");
	}
	
}

class Sub1 extends MyClass {

	@Override
	void calculate(int a) {
		
		System.out.println("The square of the number is " + a*a);
		
	}
	
}

class Sub2 extends MyClass {

	@Override
	void calculate(int a) {
		System.out.println("The Square root of the number is " + Math.sqrt(a));
		
	}
	
}

class Sub3 extends MyClass {

	@Override
	void calculate(int a) {
		
		System.out.println("The cube of the number is " + a*a*a);
		
	}
	
}

class MainMethodClass {
	
	public static void main(String[] args) {
		
		Sub1 obj1 = new Sub1();
		Sub2 obj2 =  new Sub2();
		Sub3 obj3 = new Sub3();
		
		obj1.Start();
		obj1.calculate(2);
		obj2.calculate(4);
		obj3.calculate(2);
	}
}
