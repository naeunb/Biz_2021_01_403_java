package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_011 {
	public static void main(String[] args) {
		
		/*
		 * java에서는 변수,객체를 선언할 때 사용하기 직전에 선언 및 초기화를 하면 됨.
		 * 통상적으로 코딩을 할 때 변수,객체등의 선언은 가급적 코드의 시작부분(클래스,메서드 선언명령문아래)에 작성.
		 */
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		int rndNums[] = new int[100];// == int[] rndNums = new int[100]
		
		//생성된 rndNums배열에 임의의 정수 100개를 저장.
		//배열을 만들어두면 이후의 코드에서 한번 생성된 임의의 정수 100개를 자유롭게 활용할 수 있음.
		for(int i=0; i<rndNums.length; i++) {
			rndNums[i] = rnd.nextInt(100)+2;
		}
		
		//rndNums 배열에 담겨있는 정수들을 psV2.prime() method에게 보내서 소수인가를 검사.
		//psV2.prime(rndNums) ==> x!! prime 메서드에 배열을 통째로 전달할수 없는 이유
		//-->psV2.prime메서드는 매개변수가 (int num)으로 선언되어있음.
		//즉 이 메서드는 전달받을 수 있는 값이 정수 1개뿐.
		//그래서 배열(100개의 정수)을 한꺼번에 전달할 수 없음.
		//한개씩 전달해야하기 때문에 for반복문을 사용하는것.
		for(int i=0; i<rndNums.length; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result>0) {
				System.out.println(num+"");
			}
		}
		for(int i=0; i<rndNums.length; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result>0) {
				intPrimeSum += num;
			}
		}
		for(int i=0; i<rndNums.length; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result>0) {
				intPrimeCount ++;
			}
		}
	}
}
