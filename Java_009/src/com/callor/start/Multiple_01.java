package com.callor.start;

public class Multiple_01 {
	public static void main(String[] args) {
		
		int intSum = 0;
		//1~100까지 3의배수이면서 9의배수인수들의 합
		for(int i=0; i<100; i++) {
			int num = i+1;
			if(num%3 == 0 && num%9 == 0) {
				intSum += num;
			}
		}
		System.out.println(intSum);
		
		System.out.println("=====");
		
		intSum = 0;
		for(int i=0; i<100; i++) {
			int num = i+1;
			boolean bYes3M = num%3 == 0;
			boolean bYes9M = num%9 == 0;
			if(bYes3M && bYes9M) {
				intSum += num;
				System.out.println(num+" : 3과 9의배수");
			}
		}
		System.out.println(intSum+" : 3과 9의 배수의 합");
		
		System.out.println("=====");
		
		intSum = 0;
		for(int i=0; i<100; i++) {
			int num1 = i+1;
			boolean bYes3M = num1%3 == 0;
			boolean bYes9M = num1%9 == 0;
			
			// if() 비교연산문을 중복처리하는 방식
			if(bYes3M) { // 3의 배수를 검사하고 맞으면
				if(bYes9M) { //다시 9의 배수를 검사
					intSum += num1;
					System.out.println(num1);
				}
			}
		}
		System.out.println(intSum);
	}
}
