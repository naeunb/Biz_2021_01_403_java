package com.callor.start;

public class Multiple_01 {
	public static void main(String[] args) {
		// 7~106까지 3의 배수들의합
		
		int sum=0;
		for(int i=0; i<100; i++) {
	
			int num = i+7;
			
			if(num%3==0) {
				sum += num;
				System.out.println(num);
			}
		}
		System.out.println(sum);
		
		
		
		int int3M = 0;
		for(int i=0; i<100; i++) {
			int num = 1+7;
			boolean bYes = num%3 == 0;

			// if(num%3==0) {
			// if(bYes == true) {
			if(bYes) {
				int3M += num;
				System.out.println(num + " : 3의 배수");
			}
		}
		System.out.println("3의 배수합 : " + int3M);
	}
}
