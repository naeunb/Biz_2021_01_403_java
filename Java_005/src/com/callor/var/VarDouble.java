package com.callor.var;


/*
 * 실수, 배정도 실수를 표현하기
 * 
 * int : 2의 32승 범위의 숫자 표현
 * double : 2의 64승 범위의 숫자 표현(소수점 자릿수 감안, 소수점 이하 16자리까지 표현)
 * 
 * 
 * 컴퓨터에서 큰 수를 저장(표현)하는 방법
 * 323.0000 = 3.23000 x 10의 2승 = 3.23E+2
 * 			
 */
public class VarDouble {
	public static void main(String[] args) {
		double num1 = 30.0;
		double num2 = 40.0;
		
		double num3 = 50; //실수로 변환되어 저장됨
		double num4 = 50.111111111111111;
		double num5 = 50.000000000000000;
		double num6 = 50.22222222222222;
		double num7 = 50.55555555555555;
		
		System.out.println(num1 + num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
	}
}
