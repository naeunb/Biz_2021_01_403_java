package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
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
		
		for(int i=0; i<intNums.length; i++) {
			if(intInput == intNums[i]) {
				System.out.println(i+"번째 배열 "+intInput);
				break;
			}
		}
	}
}

//입력받은 정수가 배열 intNums에서 최초로 나타나는 위치번호만 출력