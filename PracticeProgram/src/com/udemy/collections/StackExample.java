package com.udemy.collections;

import java.util.Stack;

public class StackExample {

	
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println(st);
		System.out.println("Popped element is " + st.pop());
		System.out.println(st);
		
		//the indexing is a little different in stack
		int position = st.search(10);
		
		System.out.println("Position of element is " + position);
	}
}
