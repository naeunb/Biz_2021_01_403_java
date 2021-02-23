package com.callor.applications;

import java.util.Random;

public class Array_05 {
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		Random rnd = new Random();
		for(int i=0; i<intNums.length; i++) {
			intNums[i] = rnd.nextInt(100)+1;
		}
		
		int sum = 0;
		for(int i=0; i<intNums.length; i++) {
			if(intNums[i]%3 == 0 && intNums[i]%5 == 0) {
				System.out.println(i+"번째 배열에 저장된 값, "+intNums[i]);
				sum += intNums[i];
			}
		}
		System.out.println("----------------------------");
		System.out.println("저장된 값들의 합계 = "+sum);
	}
}
