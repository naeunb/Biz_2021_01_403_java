package com.callor.start;

public class Multiple_02 {
	public static void main(String[] args) {
		
		//7~106 까지 3의 배수가 아닌수들의 합
		int sum = 0;
		for(int i=0; i<100; i++) {

			int num = i+7;
			boolean bYes = num%3 == 0;
			
			if(!bYes) {
				sum += num;
			}
			
		}
		System.out.println(sum);
		
		
		int intSum = 0;
		for(int i=0; i<100; i++) {
			int num = i + 7;
			boolean bYes  = num%3>0;
			if(bYes) {
				intSum += num;
			}
		}
		System.out.println(intSum);

		
		int intSum1 = 0;
		for(int i=0; i<100; i++) {
			int num = i + 7;
			boolean bYes  = num%3 != 0; // => num%3 == 1  &&  num%3 == 2
			if(bYes) {
				intSum1 += num;
			}
		}
		System.out.println(intSum1);
		
		System.out.println("================");
		
		int intSum2 = 0;

		for(int i = 0 ; i < 100; i++) {
			int num = i + 7;
			boolean bYes1 = num % 3 == 1;
			if(bYes1) {
				intSum2 += num;
			}
			boolean bYes2 = num % 3 == 2;
			if(bYes2) {
				intSum2 += num;
			}
		}
		System.out.println("================");
		
		System.out.println(intSum2);
		
		
	}
}
