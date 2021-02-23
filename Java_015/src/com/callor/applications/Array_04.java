package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<intNums.length; i++) {
			intNums[i] = rnd.nextInt(10)+1;
		}

		System.out.print("숫자입력(1~10) >> ");
		int intInput = scan.nextInt();

		System.out.println("-------------------");
		
		int lastPos = 0;
		for(int i=0; i<intNums.length; i++) {
			if(intInput == intNums[i]) {
				System.out.println(i+"번째 "+intInput);
				lastPos = i;//키보드로 입력한 값이 일치할대마다 그 위치를 lastPos에 저장.
			}
		}
		System.out.println("마지막위치는 "+lastPos+"번째");
	}
}
//입력받은 정수가 배열 intNums에서 마지막으로 나타나는 위치번호만 출력