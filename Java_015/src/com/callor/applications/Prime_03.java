package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력(2이상) >> ");
		
		//입력한 정수를 변수 key에 저장
		int key = scan.nextInt();
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		//prime메서드를 호출해서 코드가 실행되면 return값만 남음
		int result = psV2.prime(key);//그 리턴값 저장
		if(result <0) {//리턴값으로 소수판별 문장 출력
			System.out.println(key+" : 소수가 아님");
		} else {
			System.out.println(key+" : 소수");
		}
	} 
}
