package com.callor.start;

public class NumList_01 {
	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			int num1 = i+1;
			System.out.println(num1);
		}
		System.out.println("=========");
		for(int i=0; i<100; i++) {
			int num1 = i+1;
			System.out.print(num1+",");
			if(num1%5 == 0) {
				System.out.println();
			}
		}
		System.out.println("=========");
		for(int i=0; i<100; i++) {
			int num1 = i+1;
			
			// 역슬래시(\)로 시작되는 영문자 => escape문자
			// 키보드를 눌러서 표현하지 못하는 특별한 기호신호,문자등을 표현하는 방법
			// "\t"   : tab key
			System.out.print(num1+"\t");
			if(num1%5 == 0) {
				System.out.println();
			}
		}
		System.out.println("대한\t민국");
		System.out.println("우리나라\t대한민국");
		System.out.println("=========");
		System.out.println("구구단");
		System.out.println("=========");
		for(int i=0; i<10; i++) {
			int dan = 7;
			System.out.println(dan+"\tx\t" + i + "\t=\t" + dan * i);
		}
		System.out.println("=========");
		System.out.print("대한민국\t");
		System.out.print("우리나라\t");
		System.out.print("만세\n"); // "\n"   : enter key
		System.out.print("Republic of korea");
		System.out.print("\n\n\n\n");
		System.out.println("Welcome to korea");
	}
}
