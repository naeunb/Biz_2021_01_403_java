package com.callor.applications;

import java.util.Random;

public class Score_05 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intKor = new int[20];
		
		//1~100까지 중 임의의수를 20개 생성해서  intKor배열에 주소0번부터 19번까지 위치에 한개씩 저장.
		for(int index=0; index<20; index++) {
			int num = rnd.nextInt(100)+1;
			intKor[index] = num;
		}
		
		// intKOr 배열에 저장된 값들을 0번주소에 저장된 값부터 19번 주소에 저장된 값까지 순서대로 출력.
		for(int index=0; index<20; index++) {
			
			/*
			 * kor_index=100;  => kor_0 ~ kor_100 (X)
			 * kor_index라는 코드가 index변수값을 가져와서 kor_0 ... kor_100과 같은방식으로 변환되지않음 
			   java는 kor_index = 100이라는 코드를 만나면 kor_index라는 변수가 선언되어 있는지 찾고 없으면 오류를 발생함.
			 */
			
			System.out.println(index+"번 : "+intKor[index]);
		}
	}
}
