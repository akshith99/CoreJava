package com.udemy.collections;

import java.util.Arrays;

public class CopyToNewArray {

	public static void main(String[] args) {
		
		int [] arr = {1,4,2,6,5};
		int [] arr1 = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			arr1[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}
}
