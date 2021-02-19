package com.callor.applications;

public class IntegerEx_01 {
	public static void main(String[] args) {
		
		String strNum1 = "30";
		String strNum2 = "40";
		String strSum = strNum1+strNum2;
		System.out.println(strSum);
		
		/*
		 * Integer.valueOf("문자열형 숫자");
		 * 
		 * 문자열형 숫자를 4칙연산이 가능한 정수로 바꾸어서 return해주는 method
		 */
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		int intSum = intNum1+intNum2;
		System.out.println(intSum);
		
		
		String str1 = "11";
		String str2 = "22";
		System.out.println(str1+str2);
		
		//문자열형숫자(str1에 담긴 값)를 정수로 변환하여 return하고 정수형변수 num1에 저장.
		int num1 = Integer.valueOf(str1);
		int num2 = Integer.valueOf(str2);
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
		System.out.println(num1+num2);
		
		int num3 = Integer.valueOf("30"); //정수 30
		num3 = Integer.valueOf("03"); //정수 3
		num3 = Integer.valueOf("300"); //정수 300
		System.out.println(num3*3);
		
		//문자열형숫자를 정수형으로 바꿀 때 발생하는 오류 상황들
		// NumberFormatException => 문자열형숫자를 정수로 변환하려고 했는데 얼마(숫자)로 변환해야할지 알 수 없음.
		num3 = Integer.valueOf("3 "); //문자열 중 빈칸이 있는 경우
		num3 = Integer.valueOf("3A"); //문자열 중 숫자형이 아닌 문자열이 있는경우
		num3 = Integer.valueOf("3 3");
		num3 = Integer.valueOf("A3");
		num3 = Integer.valueOf("3+");
		
	}
}
