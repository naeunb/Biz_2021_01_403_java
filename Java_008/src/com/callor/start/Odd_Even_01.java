package com.callor.start;

public class Odd_Even_01 {
	public static void main(String[] args) {
		
		// 1~100까지 짝수들의합
		//    "  	 홀수들의합

		// 짝수,홀수 구분 
		//
		// 나머지가 0 = 짝수
		
		int intSumEven = 0;
		int intSumOdd = 0;
		
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				intSumEven += i;
			}
		}
		for(int i=0; i<=100; i++) {
			if(i%2>=1) {
				intSumOdd += i;
			}
		}
		System.out.println(intSumEven);
		System.out.println(intSumOdd);
		
		
		
		
		// 위에서 선언하고 사용햇던 변수를 '재사용'하기 => 반드시 초기화(clear)해야함
		intSumOdd = 0;
		for(int i=0; i<100; i++) {
			int num = i+1;
			boolean bYes = num % 2 == 0;
			
			//if(bYes == false) {
			if(!bYes) { //bYes가 true가 아니면 
				intSumOdd += num;
			}
		}
		System.out.println("홀수의 합 : " + intSumOdd);
			
	}
}
