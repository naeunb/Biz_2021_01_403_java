package com.callor.applications.service;

public class ScoreServiceV4 {
	public void score(int intSum, float floatAvg) {
		System.out.println("총점 :" + intSum);
		System.out.println("평균 :" + floatAvg);
	}
	
	public void print(int intKor, int intEng, int intMath) {
		//연산, 계산부분을 처리 후 출력부분 처리
		int sum = intKor+intEng+intMath;
		float avg = sum/3F;
		System.out.println("====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------");
		System.out.print(intKor+"\t");
		System.out.print(intEng+"\t");
		System.out.print(intMath+"\t");
		System.out.print(sum+"\t");
		System.out.println(avg);
		System.out.println("====================================");
	}
	
}
