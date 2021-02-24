package com.callor.applications;

import java.util.Random;

/*
 * 배열없이 단순하게 난수를 생성하고 소수인지 판별하여 출력하기. [이중 반복문]
 */
public class Prime_04 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				//여기 코드는 (i 반복횟수)*(j 반복횟수)만큼 실행함.
			}
		}
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		for(int i=0; i<10; i++) {
			int rndNum = rnd.nextInt(1000)+2;
			
			//생성된 난수(rndNum)값이 소수인지 검사
			int index=0;
			for(index=2; index<rndNum; index++) {
				if(rndNum % index == 0) {
					break;
				}
			}
			if(index < rndNum) {
				System.out.println(rndNum+"는 소수 아님");
			} else {
				System.out.println(rndNum+"는 소수");
				intPrimeSum += rndNum;
				intPrimeCount ++;
			}
		}//END for i
		
		System.out.println("합계 : "+intPrimeSum);
		System.out.println("카운트 : "+intPrimeCount);
		
	}
}
