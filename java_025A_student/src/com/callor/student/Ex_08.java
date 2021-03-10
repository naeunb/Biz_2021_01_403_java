package com.callor.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여 10~100까지 임의의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수중에 소수들만 찾아서 console에 출력
 */
public class Ex_08 {
	public static void main(String[] args) {
		int[] num = new int[100];
		Random rnd = new Random();
		
		for(int i=0; i<num.length; i++) {
			num[i] = rnd.nextInt(91)+10;
		}
		
		int pos = 0;
		for(int i=0; i<num.length; i++) {
			//System.out.println(num[i]); //	100개의 배열에 담긴 정수들
			for(pos=2; pos<num[i]-1; pos++) {
				if(num[i]%pos == 0) {
					System.out.println(num[i]);
				} else {
					break;
				}
			}
		}
	}
}

/*

1.자신보다 작은숫자 리스트
 2.자신보다 작은숫자로 나누기
 3.나눈값의 나머지가 0이 나오면 소수아님
 */

