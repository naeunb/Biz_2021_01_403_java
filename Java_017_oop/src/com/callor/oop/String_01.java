package com.callor.oop;

import java.util.Scanner;

public class String_01 {
	public static void main(String[] args) {
		
		String str1 = "대한민국";
		String str2 = "";
		
		int num1 = 0;
		Integer num2 = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 >> ");
		String strNum = scan.nextLine();
		
		if(strNum == null) {// null: 0도 아니고 아무것도 없는 것 => 클래스를 객체로 선언할때 임시로 설정하는 값으로 사용
			//Random rnd = new Random() 또는 Random rnd= null 이렇게 사용하는게 좋음
			System.out.println("숫자를 반드시 입력하세요");
		}
	}
}
