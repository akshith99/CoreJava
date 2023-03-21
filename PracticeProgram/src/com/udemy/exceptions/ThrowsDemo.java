package com.udemy.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsDemo {

	private String name;
	
	void accept() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name: ");
		
		name = br.readLine();
	}
	
	void display() {
		System.out.println("Name : " + name);
	}
}

class Implement {
	
	public static void main(String[] args) throws IOException {
		
		ThrowsDemo demo = new ThrowsDemo();
		
		demo.accept();
		demo.display();
	}
}
