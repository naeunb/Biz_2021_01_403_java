package com.callor.oop;

public class StringEQ_01 {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 30;
		int num3 = 30;
		
		Integer num4 = new Integer(30); //java 9이후에서는 사용금지
		Integer num5 = 30;
		Integer num6 = 30;
		
		float num7 = 30.0f;
		
		//정수형변수에 저장된 값이 서로 같은지 비교
		System.out.println(num1 == num2);
		System.out.println(num3 == num4);
		
		//정수형변수에 저장된 값과 실수형 변수에 저장된 값이 같은지 비교
		System.out.println(num6 == num7);
		
		//type이 다른 값끼리 비교할때는 주의필요.
		System.out.println(num6 == (int)num7);
		
		String str1 = "KOREA";
		String str2 = "KOREA";
		String str3 = "KOREA";
		String str4 = "kOREA";
		String str5 = "KOREA ";
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		System.out.println(str1 == str5);

		//문자열변수를 일반변수처럼 선언하면 ==연산으로 비교가 가능
		String str11 = "KOREA";
		String str6 = new String("KOREA");
		//문자열변수를 클래스방식으로 선언하면 ==연산으로 같은지 비교가 불가능
		String str7 = new String("KOREA");
		
		System.out.println(str11 == str6);
		System.out.println(str1 == str6);
		System.out.println(str6 == str7);
		/*
		 * 문자열은 생성하는 방법에 따라 일반변수와 다른 현상을 보일때가 있다. 특히 변수에 저장된 값이 같음에도 불구하고 
		 * EQ(==)연산을 사용하여 같은지 비교하면 false결과가 나기도 한다.
		 * 만약 코드중간에 어떤이유로 이러한 현상이 발생한다면 if(문자열변수 == "문자열")과 같은 코드에서 예측할 수 없는
		 * 논리적 오류가 발생할것임.
		 * 
		 * 이러한 이유로 문자열은 절대 EQ연산을 수행하지 않음.
		 */
		
		//문자열을 비교할때는 문자열.equals(비교값)형식의 method를 사용해야 함.
		System.out.println("문자열 equls(): "+str11.equals(str7));
		
		System.out.println(str1.equalsIgnoreCase(str3));
		
		
		
		
	}
	
}
