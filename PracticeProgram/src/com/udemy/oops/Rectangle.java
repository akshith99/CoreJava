package com.udemy.oops;

public class Rectangle {

	
	int length;
	int breadth;
	
	void insert(int l, int b) {
		length = l;
		breadth = b;
	}
	
	void computeArea() {
		System.out.println("Area is " + length*breadth);
	}
	
}

class Area extends Rectangle {
	
	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		rect.insert(10, 5);
		rect2.insert(3, 10);
		
		rect.computeArea();
		rect2.computeArea();
		
	}
}
