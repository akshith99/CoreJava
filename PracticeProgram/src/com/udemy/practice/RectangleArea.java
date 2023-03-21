package com.udemy.practice;

import java.util.Scanner;

public class RectangleArea {

	
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			double area, length, breadth;
			
			System.out.print("Enter length : ");
			
			length = input.nextDouble();
			
			System.out.print("Enter breadth : ");
			breadth = input.nextDouble();
			
			area = length * breadth;
			
			System.out.println("Area of the rectangle is: " + area);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
