package com.udemy.abstraction;

abstract class Shape {

	abstract void draw();
	
}

class Rectangle extends Shape {
	
	void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Triangle extends Shape {
	
	void draw() {
		System.out.println("Draw Triangle");
	}
}

class MainClass {
	
	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}