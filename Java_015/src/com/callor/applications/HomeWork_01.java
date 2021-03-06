package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] num = new int[100];
		int i;
		int intPrimeCount = 0; //개수세기
		int sum = 0; //합계구하기
		for(i=0; i<num.length; i++) {
			num[i] = rnd.nextInt(100)+2;
			//System.out.println("랜덤으로 "+num.length+"개의 수 생성 : "+num[i]);
		}
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		System.out.println("================");
		System.out.println("===소수리스트===");
		System.out.println("================");
		
		for(i=0; i<num.length; i++) {
			int result = psV2.prime(num[i]);
			if(result > 0) {
				System.out.println(result);
				sum += result;
				intPrimeCount ++;
			}
		}//END for
		
		System.out.println("================");
		System.out.println("소수인 수들의 개수 = "+intPrimeCount);
		System.out.println("소수인 수들의 합계 = "+sum);
		
	}
}

//임의의 정수 100개 중 소수인 수들의 리스트 출력
//소수인 수들의 합을 계산하여 출력