package com.callor.start;

public class Multiple_01 {
	public static void main(String[] args) {
		// 7~106까지 3의 배수들의합
		
		int num=0;
		for(int i=0; i<100; i++) {
	
			if((i+7)%3==0) {
				num += (i+7);
				System.out.println(i+7);
			}
		}
		System.out.println(num);
	}
}
