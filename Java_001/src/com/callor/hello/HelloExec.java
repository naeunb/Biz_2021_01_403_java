package com.callor.hello;

// 주석
/*
 주석(comment statement)
*/
public class HelloExec{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String 리터럴
		System.out.println("반갑습니다");
		System.out.println("우리나라만세");
		
		//계산
		System.out.println(30 + 40);
		System.out.println(30+ 40);
		
	
		System.out.println("30 + 40");
		
		// 문자열연결
		System.out.println("30" + "40");
		
		System.out.println("우리나라 + 대한민국");
		System.out.println("우리나라" + "대한민국");
		
		System.out.println("30 * 40");
		// System.out.println("30" * "40");
		
		/*
		
		숫자와 숫자는 4칙연산을 수행
		숫자와 숫자의 4칙연산은 수학의 연산규칙과 같음
		문자열과 문자열의 연산은 연결(+)만 가능
		문자열과 문자열을 연결하여 한 문자열로 만듦
		 
		*/
		
		// 문자열 + 숫자 => 문자열
		System.out.println("30"+30);
		
		System.out.println("30 + 40 =" + 30 + 40);   //문자열
		System.out.println("30 + 40 =" + (30 + 40)); // ()=>연산의 우선순위
		
		System.out.println("30 x 40 =" + 30 * 40);

	}

	
	
	
	
	
	
	
	
	
	
}
