package com.udemy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Strawberry");
		
		//Iterating through the list
		System.out.println(list);
		
		System.out.println("This is using the for each loop");
		
		for (String fruit : list) {
			System.out.println(fruit);
		}
		
		System.out.println("This is using the iterator");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Finding the size of the arrayList and removing elements
		int size = list.size();
		System.out.println("No. of elements = " + size);
		
		//Removing element from the list
		list.remove(3);
		System.out.println(list);
		list.remove("Apple");
		System.out.println(list);
		
		//Get and Set methods of arrayList
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Purple");
		
		System.out.println(colors);
		colors.set(0, "Orange");
		System.out.println(colors);
		System.out.println("Returning element: " + colors.get(2));
		
		//Sorting ArrayList
		Collections.sort(colors);
		System.out.println("After sorting " + colors);
		
		//Sorting ArrayList of Integers
		ArrayList<Integer> score = new ArrayList<Integer>();
		score.add(97);
		score.add(85);
		score.add(58);
		score.add(63);
		score.add(72);
		
		System.out.println("Before Sorting");
		for (Integer marks : score) {
			System.out.println(marks);
		}
		
		System.out.println("AFter sorting");
		
		Collections.sort(score);
		
		for (Integer marks : score) {
			System.out.println(marks);
		}
	}
}
