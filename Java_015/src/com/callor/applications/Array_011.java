package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_011 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		for(int i=0; i<intNums.length; i++) {
			intNums[i] = rnd.nextInt(10)+1;
		}
		
		//키보드 입력을 받기 위해 Scanner 클래스를 scan객체로 선언하고 scan객체를 인스턴스화 => 사용할 준비
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 1~10까지 중 숫자 입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();

		int count = 0; //개수를 세기위해 선언
		//intNums는 어떤 값이 저장되어 있는지 모름. 단 1~10까지의 숫자들이 들어있을것
		//intNums배열에 저장된 숫자들 중 키보드로 입력받은 값(keyNum에 저장되어있음)과 같은 값들이 몇개 저장되어있는지
		for(int i=0; i<intNums.length; i++) {
			boolean bYes = intNums[i] == keyNum;
			if(bYes) {
				count++;
				System.out.println(intNums[i]);
			}
		}
		System.out.println(keyNum + "의 개수 : "+count);
		
	}
}
