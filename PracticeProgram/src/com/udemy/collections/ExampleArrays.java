package com.udemy.collections;

import java.util.Arrays;

public class ExampleArrays {

	public static void sortWithIndex() {
		
		int [] arr = {30,20,10,50,40};
		
		 int fromIndex = 1;
	     int toIndex = 4;
	     
	     System.out.println("Index based sort");
	        Arrays.sort(arr, fromIndex, toIndex);
	        System.out.println(Arrays.toString(arr));
	    }
	
	public static void binarySearch() {
		
		int [] arr = {30,20,10,50,40};
		
		System.out.println("This is binary search");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int index = Arrays.binarySearch(arr, 40);
		
		System.out.println("The element is at " + index);
	}
	
	public static boolean arrayEquals() {
		
		int [] arr = {30,20,10,50,40};
		int [] arr1 = {30,15,10,50,40};
		
		if(Arrays.equals(arr, arr1))
			return true;
		
		return false;
		
	}
	
	public static void copyOfArray() {
			
		System.out.println("Copy of method");
			int [] arr = {30,20,10};
			
			int [] copy = Arrays.copyOf(arr, 5);
			
			System.out.println(Arrays.toString(copy));
			
		}
	
	public static void arrayFillMethod() {
		
		System.out.println("Array fill method");

		int [] arr = {30,20,10,50,40};
		
		Arrays.fill(arr, 10);
			System.out.println(Arrays.toString(arr));
			
		}
	
	public static void arraySort() {
		
		int [] arr = {30,20,10,50,40};
		
		//before sort
		System.out.println("Before sort");
		for (int i : arr) {
			System.out.println(i);
		}
		//After sort
		System.out.println("After sort");
		
		Arrays.sort(arr);

		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void binarySearchArray() {
		
		int [] arr = {30,20,10,50,40};
		//binary search
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 30);
				
		System.out.println("The index of 30 is " + index);
	}
		
	public static void main(String[] args) {

		sortWithIndex();
		binarySearch();
		System.out.println(arrayEquals());
		copyOfArray();
		arrayFillMethod();
		arraySort();
		binarySearchArray();
		
	}
	
	
}
