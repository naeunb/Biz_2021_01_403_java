package com.callor.applications;

import java.util.Random;

public class Array_02 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intNum = new int[10];
		
		int intSum=0;
		int intSumEven=0;

		for(int i=0; i<10; i++) {
			intNum[i] = rnd.nextInt(100)+1;
			System.out.println("랜덤숫자 : "+intNum[i]);
			
		}
		System.out.println("===================");
		for(int i=0; i<10; i++) {
			intSum += intNum[i];
		}
		for(int i=0; i<10; i++) {
			if(intNum[i]%2 == 0) {
				intSumEven += intNum[i];
				//System.out.println("짝수 : "+intNum[i]);
				//System.out.println("----");
			}
			
		}
		System.out.println("전체합계 : "+intSum);
		System.out.println("===================");
		System.out.println("짝수합계 : "+intSumEven);
		
	}
}
