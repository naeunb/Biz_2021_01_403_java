package com.callor.start.loop;

public class Loop_01 {
	public static void main(String[] args) {
		// 가. 100~1000까지 범위수를 100단위씩 출력
		for (int num = 100; num <= 1000; num += 100) {
			System.out.println(num);
		}
		System.out.println("----------");
		/*
		 * 보편적으로 for() 반복문을 사용하여 코딩할때 시작값은 보통 0으로 초기화 int num = 0;
		 * 종료를 위한 비교연산 등호를 가급적 사용하지 않음 num < 10
		 * 증가값(변화값)은 가급적 1씩 증가,감소 하도록 코딩 : num += 1
		 */
		for (int num = 0; num < 10; num += 1) {
			int num1 = (num + 1) * 100;
			System.out.println(num1);
		}
		
		
		// 나. 1~10까지 순서번호를붙여 문자열출력 1.홍길동~10.홍길동
		for (int num = 1; num <= 10; num += 1) {
			System.out.println(num + ".홍길동");
		}
		System.out.println("----------");
		for (int num = 0; num < 10; num +=1) {
			System.out.println((num+1) + ".홍길동");
		}
		for (int num = 0; num < 10; num += 1) {
			int num1 = num + 1 ;
			System.out.println(num1 + ".홍길동");
		}
	}
}
