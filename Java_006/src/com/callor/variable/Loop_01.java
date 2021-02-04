package com.callor.variable;

/*
 * 반복문
 * 똑같은 명령문들로 구성된 코드가 있을 때 명령문을 한번만 작성하고 일정 횟수만큼 실행하도록 하는 코딩 방법
 */
public class Loop_01 {
	public static void main(String[] args) {
		
		// for() { } =>반복문
		/*
		 * 현재 작성한 코드는 대한민국 만세 문자열을 console에 무한히 출력하는 코드
		 * 똑같은 코드를 반복적으로 작성, 복사 붙이기 하지않고 마치 똑같은 코드가 여러번 있는 것처럼 실행하는 방식
		 */
		for(;;) {
			System.out.println("대한민국 만세");
		}
		
		// 현재 for문이 무한히 반복되기 때문에 아래코드는 실행될 수 없음
		//System.out.println("잘가세요");
		
		
	}
}
