package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력(2이상) >> ");
		int key = scan.nextInt();

		boolean bYes = true;
		for(int i=2; i<key; i++) {
			bYes = key%i==0;
			if(bYes) {
				System.out.println("소수가 아님");
				break;
			}
		}
		
		int pos = 0;
		for(pos=2; pos<key; pos++) {
			if(key%pos==0) {
				break;
			}
		}
		/*
		 * pos값은?
		 */
		System.out.println(pos);
		/*
		 * for문이 중간에 break되면 =====> 항상 pos < key 관계가 됨
		 * for문이 break없이 모두 완료됐다면
		 */
		if(pos<key) {
			System.out.println(key+" : 소수가 아님");
		} else {
			System.out.println(key+" : 소수임");
		}
	}
}

// 15 =>1,3,5,15
// 7 =>1,7

//소수 구하기. 1과 자신이외의 숫자로 나누어지지않는수, 1과 자신 이외의 약수를 갖지 않는 수

//자기 자신보다 작은 수들을 나누어봐서, 하나라도 나누어지면 소수가 아닌 것
/*

 1.자신보다 작은숫자 리스트
 2.자신보다 작은숫자로 나누기
 3.나눈값의 나머지가 0이 나오면 소수아님
 
 */
