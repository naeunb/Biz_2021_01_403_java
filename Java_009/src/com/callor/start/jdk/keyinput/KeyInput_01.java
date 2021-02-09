package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_01 {
	//키보드로 숫자 2개를 입력받고 두 숫자의 덧셈을 계산
	public static void main(String[] args) {
		System.out.println(); //console출력문
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력 >> ");
		int intNum1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력 >> ");
		int intNum2 = scan.nextInt();//키보드로부터 값을 입력받기위해 사용
		
		System.out.println(intNum1 + intNum2);
	}
}
