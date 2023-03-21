package com.udemy.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("A", 10);
		hm.put("B", 20);
		hm.put("C", 30);
		hm.put("D", 40);
		hm.put("E", 50);
		
		System.out.println(hm);
		
		System.out.println(hm.get("A"));
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println("The size of the hashmap is " + hm.size());

		System.out.println(hm.remove("E"));
		
		hm.clear();
		
		System.out.println(hm);
		
		System.out.println(hm.isEmpty());
	}
}
