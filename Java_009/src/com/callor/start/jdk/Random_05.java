package com.callor.start.jdk;

import java.util.Random;

public class Random_05 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intRdnSum = 0;
		//1~100까지 숫자를 만들고 그 수중에 짝수들만의 합을 구하시오
		for(int i=0; i<100; i++) {
			int intRdnNum = rnd.nextInt(100)+1;
			boolean bYes = (intRdnNum)%2 == 0;
			if(bYes) {
				intRdnSum += intRdnNum;
				System.out.println(intRdnNum);
			}
		}
		System.out.println(intRdnSum);
		
	}
}
