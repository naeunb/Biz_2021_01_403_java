package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_02 {
	public static void main(String[] args) {
			
		//임의의 숫자 입력후 홀/짝 판별하여 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int intNum = scan.nextInt();
		if(intNum%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
