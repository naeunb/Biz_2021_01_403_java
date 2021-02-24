package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

public class Score_02 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String strName[] = {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		String strSubject[] = {"국어","영어","수학"};

		int intKor[] = new int[strName.length];
		int intEng[] = new int[strName.length];
		int intMath[] = new int[strName.length];
		int intSum[] = new int[strName.length];
		float floatAvg[] = new float[strName.length];
		
		/* 점수생성 */
		for(int i=0; i<strName.length; i++) {
			intKor[i] = rnd.nextInt(100)+1;
			intEng[i] = rnd.nextInt(100)+1;
			intMath[i] = rnd.nextInt(100)+1;
		}
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		/*
		 * i번째 학생의 3과목 점수를 scoreSum()에 전달하고 결과를 다시 i번째 학생의 총점에 저장
		 * intSum[i] ==> i번째 학생의 총점
		 */
		for(int i=0; i<strName.length; i++) {
			int sum = ssV1.scoreSum(intKor[i],intEng[i],intMath[i]);
			intSum[i] = sum;
		}
		for(int i=0; i<strName.length; i++) {
			float avg = ssV1.scoreAvg(intSum[i]);
			floatAvg[i] = avg;
		}
		System.out.println("============================================");
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("--------------------------------------------");
		for(int i=0; i<strName.length; i++) {
			ssV1.scorePrint(strName[i],intKor[i],intEng[i],intMath[i],intSum[i],floatAvg[i]);
		}
		
		
		
		
		/*
		 * ========================================================
		 */
		//이름,국어,영어,수학,총점,평균 배열을 통째로 매개변수로 전달하고 ssV1.print() method에서 리스트를 출력
		ssV1.print(strName, intKor, intEng, intMath, intSum, floatAvg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
