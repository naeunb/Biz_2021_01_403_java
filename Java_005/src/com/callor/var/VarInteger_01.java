package com.callor.var;

public class VarInteger_01 {
	public static void main(String[] args) {
		//정수형변수 intNum1을 선언하고 정수형 값 30을 저장
		int intNum1 = 30;
		Integer intNum2 = 40;
		
		//키워드와 관계없이 변수 이름은 중복선언 불가!
		//int intNum2 = 50;
		
		/*
		 * 변수의 사용법
		 */ 
		// 1. 읽기 : 변수에 저장된 값은 아무리 많이 읽어도 저장된 값이 변하지 않는다.
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		
		// 2. 저장하기
		// 변수명 = 값
		// 변수 intNum1에 정수형 값 50을 저장
		intNum1 = 50;
		intNum2 = 20;
		
	}
}
