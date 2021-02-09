package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in); //3.임의의정수를 키보드로 입력 후 enter
		System.out.print("숫자입력 >> ");//2.숫자입력 표시 후

		int num1 = rnd.nextInt(100)+1; //1.랜덤으로 1~100까지 숫자중 1개생성, num1에 저장
		int intKeyNum = scan.nextInt(); 
		
		System.out.print(num1);
		//4.입력한 숫자가 num1변수값보다 큰가 작은가 같은가 판별하여 출력
		if (intKeyNum > num1) { //intKeyNum > num1 인가? 맞으면 출력하고 종료
			System.out.print("보다 크다");
		} else if (intKeyNum == num1) { //intKeyNum = num1 인가? 맞으면 출력하고 종료
			System.out.print("와 같다");
		} else if (intKeyNum < num1) {  //intKeyNum < num1 인가? 맞으면 출력하고 종료
			System.out.print("보다 작다");
		}
		
	}
}