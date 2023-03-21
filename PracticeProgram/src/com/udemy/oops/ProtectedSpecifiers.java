package com.udemy.oops;

//protected keyword is only accessible at subclass
class Access {
	
	private int a = 10;
	protected int b = 20;
	
	public int getA() {
		return a;
	}
	
}

class Sub extends Access {
	
	public void get() {
		System.out.println(getA());
		System.out.println(b);
	}
	
}
public class ProtectedSpecifiers {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		
		s.get();
	}
	
}
