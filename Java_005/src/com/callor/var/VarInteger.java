package com.callor.var;

/*
 * Java에서 정수를 표현하는 키워드
 * 		Integer, int
 * 		Long, long
 * 
 * 실수를 표현하는 키워드
 * 단정도 실수 : Float, float
 * 배정도 실수 : Double, double
 * 
 * 
 * var, Interger는 java의 키워드(명령어)
 * 이런 단어는 class명으로 사용불가
 * 키워드를 연상하는 클래스를 만들고 싶을 땐 두개 이상의 단어를 조합하여 이름을 만든다.
 */


public class VarInteger {
	public static void main(String[] args) {

		/*
		 * 정수형 변수 num1을 선언하고 값 25를 저장
		 * 					↓
		 * 정수 25를 기억장소의 어딘가에 저장(보관)
		 * 저장소에 num1이라고 이름표를 붙임. 단, 그 저장소에는 정수 숫자만 저장할 수 있도록
		 */
		int num1 = 25;
		int num2 = 55;
		
		//int num3 = 30.0;
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 / num1);
		System.out.println(num2 - num1);
		System.out.println(num2 % num1);
		
	}
}
