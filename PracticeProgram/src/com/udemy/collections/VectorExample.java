package com.udemy.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		int [] x = {10,20,30,40,50};
		
		for(int i = 0; i < x.length; i++) {
			
			v.add(x[i]);
		}
		
		System.out.println(v);
		
		for(int i = 0 ; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
	}
}
