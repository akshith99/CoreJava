package com.udemy.leetcode;

import java.util.Arrays;

class TwoSum {
	
    public static int[] twoSum() {
    	int[] nums = {2,7,11,15};
    	int target = 17;
    	int [] output = new int[2];
    	for(int i = 0; i<nums.length; i++) {
    		
    		for(int j = i+1; j<nums.length; j++) {
    			
    			if(nums[i] + nums[j] == target) {
    				output[0] = i;
    				output[1] = j;
    			}
    		}
    	}
		return output;
    }
    
    public static void main(String[] args) {
		
    	System.out.println(Arrays.toString(twoSum()));
    	
	}
}
