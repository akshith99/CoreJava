package com.udemy.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		
		ll.addFirst(5);
		
		int index = ll.indexOf(20);
		
		int lastIndex = ll.lastIndexOf(30);
		
		System.out.println(lastIndex);
		System.out.println(index);
		
		
		System.out.println(ll);
		
		System.out.println(ll.size());
}
}
