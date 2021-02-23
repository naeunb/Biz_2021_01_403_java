package com.callor.applications;

import java.util.*;

public class Array_01 {
	public static void main(String[] args) {
		
		/*
		 * 정수 100개를 저장할 배열변수를 선언 및 생성(초기화:사용할 준비)
		 */
		int[] intNums = new int[100];
		
		/*
		 * Random 클래스를 사용하여 rnd객체를 선언하고 = new Random()명령을 사용하여 rnd객체를 인스턴스화 시킨다.
		 * rnd : Random 클래스의 인스턴스
		 */
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력(1~10) >> ");
		int intInput = scan.nextInt();
		
		
		int count = 0;
		System.out.println("배열에 저장된 숫자");
		System.out.println("-------------------");
		
		/*
		 * 0~(intNums.length-1) 회수만큼 반복문을 실행 
		 */
		for(int i=0; i<intNums.length; i++) {
			
			/*
			 * rnd 인스턴스의 nextInt() method를 호출(실행). intNums[i]변수에 1~10까지 중 1개의 숫자 저장.
			 */
			intNums[i] = rnd.nextInt(10)+1;
			
			System.out.println("저장:"+intNums[i]);
			
			if(intInput == intNums[i]) {
				System.out.println(intNums[i]);
				count++;
			}
		}
		System.out.println("-------------------");
		System.out.println("저장된 개수 : "+count);
	}
}