package com.callor.score;

import java.util.Random;

public class Sort_02 {
	public static void main(String[] args) {
		
		int[] nums = new int[20];
		
		Random rnd = new Random();
		for(int i=0; i<nums.length; i++) {
			nums[i] = rnd.nextInt(100)+1;
		}
		
		
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}	
			}
		}
		
		int count = 0;
		for(int n:nums) {
			System.out.print(n+",");
			if(++count % 5 == 0) {
				System.out.println();
			}
		}
	}
}
