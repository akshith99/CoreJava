package com.udemy.oops;

public class RectangleWithConstructor {

	int length;
	int breadth;
	
	public RectangleWithConstructor(int l, int b) {
		length = l;
		breadth = b;
	}
	
	 int computeArea() {
		return length* breadth;
	}
}

class Main {
	
	public static void main(String[] args) {
		
		RectangleWithConstructor rect = new RectangleWithConstructor(10, 5);
		RectangleWithConstructor rect2 = new RectangleWithConstructor(7, 4 );
		
		int area1 = rect.computeArea();
		int area2 = rect2.computeArea();
		
		System.out.println("The Area of rectangle1 is : " + area1);
		System.out.println("The Area of rectangle2 is : " + area2);
	}
}
